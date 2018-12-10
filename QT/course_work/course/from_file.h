#ifndef FROM_FILE_H
#define FROM_FILE_H

#include <QWidget>

namespace Ui {
class From_file;
}

class From_file : public QWidget
{
    Q_OBJECT

public:
    explicit From_file(QWidget *parent = nullptr);
    ~From_file();

signals:
    void firstWindow();
    void sendData(QString name);

private slots:
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

private:
    Ui::From_file *ui;
};

#endif // FROM_FILE_H
