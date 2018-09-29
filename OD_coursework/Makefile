CC=g++
CFLAGS=-c -Wall
LDFLAGS=
SOURCES=dictionary.cpp coursework.cpp
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=coursework

all: $(SOURCES) $(EXECUTABLE)

$(EXECUTABLE): $(OBJECTS)
	$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CC) $(CFLAGS) $< -o $@
