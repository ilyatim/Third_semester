# первые попытки в gui
#
from tkinter import *
class MyFIrstGUI:
    def __init__(self, gui):
        self.gui = gui
        gui.title("FIRST LESSON")

        self.label = Label(gui, text="THIS IS JUST LABEL")
        self.label.pack()

root = Tk()
myGui = MyFIrstGUI(root)
root.geometry("200x90")
root.mainloop()

#gui = Tk()
#gui.title("FIRST WITH GUI")
#gui.geometry("200x85")
#frame = Frame(gui)
#frame.pack()
#but = Button(frame, text = "text")
#but.pack(side = TOP)
#gui.mainloop()