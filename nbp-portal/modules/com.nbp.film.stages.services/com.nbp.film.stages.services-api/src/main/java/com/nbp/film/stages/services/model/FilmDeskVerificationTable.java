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
 * The table class for the &quot;nbp_film_desk_verification&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmDeskVerification
 * @generated
 */
public class FilmDeskVerificationTable
	extends BaseTable<FilmDeskVerificationTable> {

	public static final FilmDeskVerificationTable INSTANCE =
		new FilmDeskVerificationTable();

	public final Column<FilmDeskVerificationTable, Long> filmDeskVerificaId =
		createColumn(
			"filmDeskVerificaId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmDeskVerificationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, String> documentName =
		createColumn(
			"documentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmDeskVerificationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private FilmDeskVerificationTable() {
		super("nbp_film_desk_verification", FilmDeskVerificationTable::new);
	}

}