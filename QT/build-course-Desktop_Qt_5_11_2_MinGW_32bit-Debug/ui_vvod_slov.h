/********************************************************************************
** Form generated from reading UI file 'vvod_slov.ui'
**
** Created by: Qt User Interface Compiler version 5.11.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_VVOD_SLOV_H
#define UI_VVOD_SLOV_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QDialog>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_vvod_slov
{
public:
    QLabel *label;
    QLineEdit *word;
    QLineEdit *definition;
    QLabel *label_2;
    QPushButton *pushButton;
    QPushButton *pushButton_2;

    void setupUi(QDialog *vvod_slov)
    {
        if (vvod_slov->objectName().isEmpty())
            vvod_slov->setObjectName(QStringLiteral("vvod_slov"));
        vvod_slov->resize(400, 300);
        label = new QLabel(vvod_slov);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(20, 100, 121, 21));
        word = new QLineEdit(vvod_slov);
        word->setObjectName(QStringLiteral("word"));
        word->setGeometry(QRect(180, 100, 201, 22));
        definition = new QLineEdit(vvod_slov);
        definition->setObjectName(QStringLiteral("definition"));
        definition->setGeometry(QRect(180, 150, 201, 31));
        label_2 = new QLabel(vvod_slov);
        label_2->setObjectName(QStringLiteral("label_2"));
        label_2->setGeometry(QRect(20, 160, 161, 21));
        pushButton = new QPushButton(vvod_slov);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(60, 230, 131, 31));
        QFont font;
        font.setPointSize(10);
        font.setBold(true);
        font.setWeight(75);
        pushButton->setFont(font);
        pushButton_2 = new QPushButton(vvod_slov);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(220, 230, 131, 31));
        pushButton_2->setFont(font);

        retranslateUi(vvod_slov);

        QMetaObject::connectSlotsByName(vvod_slov);
    } // setupUi

    void retranslateUi(QDialog *vvod_slov)
    {
        vvod_slov->setWindowTitle(QApplication::translate("vvod_slov", "Dialog", nullptr));
        label->setText(QApplication::translate("vvod_slov", "<html><head/><body><p><span style=\" font-size:10pt; font-weight:600;\">Enter a word</span></p></body></html>", nullptr));
        label_2->setText(QApplication::translate("vvod_slov", "<html><head/><body><p><span style=\" font-size:11pt; font-weight:600;\">Enter a definiton</span></p></body></html>", nullptr));
        pushButton->setText(QApplication::translate("vvod_slov", "Continue", nullptr));
        pushButton_2->setText(QApplication::translate("vvod_slov", "Cancel", nullptr));
    } // retranslateUi

};

namespace Ui {
    class vvod_slov: public Ui_vvod_slov {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_VVOD_SLOV_H
