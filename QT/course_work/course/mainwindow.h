#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include "dictionary.h"
#include "delete.h"
#include "ui_mainwindow.h"
#include "vvod_slov.h"
#include "change.h"
namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = nullptr);
    ~MainWindow();
signals:
    void sendWords(Dictionary &dictionary);
private slots:
    void receiveData(QString word, QString definition);

    void receiceWordToDelete(QString);

    void receiceWordToChange(QString, int);

    void on_pushButton_clicked();

    void on_pushButton_2_clicked();

    void on_pushButton_4_clicked();

    void on_pushButton_3_clicked();

    void on_action_3_triggered();

    void on_action_triggered();

    void on_action_2_triggered();

    void on_action_4_triggered();

    void on_action_5_triggered();

    void on_pushButton_5_clicked();

private:
    Dictionary dictionary;
    Ui::MainWindow *ui;
    vvod_slov *enter;
    Delete *del;
    Change *change;
};

#endif // MAINWINDOW_H
