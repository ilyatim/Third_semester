#ifndef IN_FILE_H
#define IN_FILE_H

#include <QWidget>
namespace Ui {
class In_file;
}

class In_file : public QWidget
{
    Q_OBJECT

public:
    explicit In_file(QWidget *parent = nullptr);
    ~In_file();
signals:
    void firstWindow();
    void sendData(QString name);

private slots:
    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

private:
    Ui::In_file *ui;
};

#endif // IN_FILE_H
