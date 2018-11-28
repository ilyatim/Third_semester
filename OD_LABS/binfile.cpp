
//запись в файл
const char *FName = "file.bin";
ofstream f(FName, ios::binary | ios::out);
f.write((char*)&Object, sizeof(Object));

//считывание файла
const char *FName = "file.bin";
ifstream f(FName, ios::binary | ios::in);
f.read((char*)&Object, sizeof(Object));
return 0;
