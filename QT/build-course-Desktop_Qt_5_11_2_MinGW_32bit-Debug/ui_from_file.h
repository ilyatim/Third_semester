/********************************************************************************
** Form generated from reading UI file 'from_file.ui'
**
** Created by: Qt User Interface Compiler version 5.11.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_FROM_FILE_H
#define UI_FROM_FILE_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_From_file
{
public:
    QLineEdit *lineEdit;
    QLabel *label;
    QPushButton *pushButton;
    QPushButton *pushButton_2;

    void setupUi(QWidget *From_file)
    {
        if (From_file->objectName().isEmpty())
            From_file->setObjectName(QStringLiteral("From_file"));
        From_file->resize(400, 300);
        lineEdit = new QLineEdit(From_file);
        lineEdit->setObjectName(QStringLiteral("lineEdit"));
        lineEdit->setGeometry(QRect(60, 90, 281, 31));
        label = new QLabel(From_file);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(4, 15, 391, 71));
        pushButton = new QPushButton(From_file);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(80, 170, 93, 28));
        QFont font;
        font.setBold(true);
        font.setWeight(75);
        pushButton->setFont(font);
        pushButton_2 = new QPushButton(From_file);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(220, 170, 93, 28));
        pushButton_2->setFont(font);

        retranslateUi(From_file);

        QMetaObject::connectSlotsByName(From_file);
    } // setupUi

    void retranslateUi(QWidget *From_file)
    {
        From_file->setWindowTitle(QApplication::translate("From_file", "Form", nullptr));
        lineEdit->setText(QString());
        label->setText(QApplication::translate("From_file", "<html><head/><body><p align=\"center\">\320\222\320\262\320\265\320\264\320\270\321\202\320\265 \320\275\320\260\320\267\320\262\320\260\320\275\320\270\320\265 \321\204\320\260\320\271\320\273\320\260 \320\270\320\267 \320\272\320\276\321\202\320\276\321\200\320\276\320\263\320\276 \321\205\320\276\321\202\320\270\321\202\320\265 \320\267\320\260\320\263\321\200\321\203\320\267\320\270\321\202\321\214</p><p align=\"center\">\320\230\320\273\320\270 \321\203\320\272\320\260\320\266\320\270\321\202\320\265 \320\277\321\203\321\202\321\214 \320\272 \321\204\320\260\320\271\320\273\321\203, \320\265\321\201\320\273\320\270 \320\276\320\275 \320\275\320\260\321\205\320\276\320\264\320\270\321\202\321\201\321\217 \320\262 \320\264\321\200\321\203\320\263\320\276\320\271 \320\277\320\260\320\277\320\272\320\265</p></body></html>", nullptr));
        pushButton->setText(QApplication::translate("From_file", "Continue", nullptr));
        pushButton_2->setText(QApplication::translate("From_file", "Cancel", nullptr));
    } // retranslateUi

};

namespace Ui {
    class From_file: public Ui_From_file {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_FROM_FILE_H
