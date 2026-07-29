# auto_enter.py
import time
import keyboard

running = True

def stop():
    global running
    running = False
    print("Stopped.")

keyboard.add_hotkey("shift+s", stop)

print("Press Shift+S to stop.")
while running:
    keyboard.press_and_release("enter")
    time.sleep(0.5)