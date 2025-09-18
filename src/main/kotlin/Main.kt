package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

/**
������ 8* � ����� 5

������ �����. ����� ���� �� ��������: https://vk.cc/cEQsA0

������ �������� ���������� ���������, ������� ������������ � ���-�������� � ����������� ������ �� ������������ "���������� �� ���������" ������� ������. ��������� ������ ��������� HTTP-������, �������� HTML-������� ��������, ����� ������ � ������� �� �� �����.

���������� � ������:

- ������ ������ � ��������� �����������, �� � ������� ������, ����� ����� ���� ��������� Pull Request �� ���-�����;

- ���������� � URL �������� � ��������: https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/;

- ��������� ���������� Jsoup ��� ���������� HTTP-������� � �������� HTML;

- ����� �� �������� ���, � ������� �������� ������;

- ������� ����� �� ������� �������� (������ � ������ ��������) � ������ ��� �� �����.
 */

private const val HTTP_URL =
    "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

private const val FIND_CLASS = ".sc-2aegk7-2"

fun main() {
    val doc: Document = Jsoup.connect(HTTP_URL).get()
    println(doc.title())
    val quotes = doc.select(FIND_CLASS)
    var i = 1
    for (quote: Element in quotes) {
        println(" ${i++}. " + quote.childNodes()[0])
    }
}

