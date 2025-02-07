/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_company_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmCompanyDetails
 * @generated
 */
public class FilmCompanyDetailsTable
	extends BaseTable<FilmCompanyDetailsTable> {

	public static final FilmCompanyDetailsTable INSTANCE =
		new FilmCompanyDetailsTable();

	public final Column<FilmCompanyDetailsTable, Long> filmCompanyDetailsId =
		createColumn(
			"filmCompanyDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmCompanyDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> countryOrigin =
		createColumn(
			"countryOrigin", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> mobile = createColumn(
		"mobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> contactPerson =
		createColumn(
			"contactPerson", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmCompanyDetailsTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmCompanyDetailsTable() {
		super("nbp_film_company_details", FilmCompanyDetailsTable::new);
	}

}