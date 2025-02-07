/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_full_registration&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistration
 * @generated
 */
public class FilmFullRegistrationTable
	extends BaseTable<FilmFullRegistrationTable> {

	public static final FilmFullRegistrationTable INSTANCE =
		new FilmFullRegistrationTable();

	public final Column<FilmFullRegistrationTable, Long>
		filmFullRegistrationId = createColumn(
			"filmFullRegistrationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmFullRegistrationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> productionType =
		createColumn(
			"productionType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> registrationNumber =
		createColumn(
			"registrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Date> dateOfIssued =
		createColumn(
			"dateOfIssued", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> productionTitle =
		createColumn(
			"productionTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Date> productionDateFrom =
		createColumn(
			"productionDateFrom", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Date> productionDateTo =
		createColumn(
			"productionDateTo", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, String> termsAndConditions =
		createColumn(
			"termsAndConditions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmFullRegistrationTable, Long> docFileEntrys =
		createColumn(
			"docFileEntrys", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmFullRegistrationTable() {
		super("nbp_film_full_registration", FilmFullRegistrationTable::new);
	}

}