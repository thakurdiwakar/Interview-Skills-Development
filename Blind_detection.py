import cv2
import pyttsx3
from gtts import gTTS
import os

# Initialize the camera (0 represents the default camera)
cap = cv2.VideoCapture(0)

# Initialize the text-to-speech engine
engine = pyttsx3.init()

while True:
    # Read a frame from the camera
    ret, frame = cap.read()

    # Perform object detection (you'll need to replace this with a suitable object detection model)
    # Here, we'll just detect faces for simplicity
    face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(gray, scaleFactor=1.3, minNeighbors=5, minSize=(30, 30))

    # Process detected objects
    for (x, y, w, h) in faces:
        # Draw a rectangle around the detected face
        cv2.rectangle(frame, (x, y), (x + w, y + h), (0, 255, 0), 2)

        # Convert the detected object label into speech
        object_label = "Face"  # Replace this with your actual label
        tts = gTTS(text=object_label, lang='en')
        tts.save("object_label.mp3")

        # Play the audio
        os.system("mpg321 object_label.mp3")

    # Display the frame with detected objects
    cv2.imshow('Object Detection', frame)

    # Break the loop if 'q' is pressed
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Release the camera and close all OpenCV windows
cap.release()
cv2.destroyAllWindows()
