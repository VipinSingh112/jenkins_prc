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
 * The table class for the &quot;nbp_film_app_stages&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStages
 * @generated
 */
public class FilmApplicationStagesTable
	extends BaseTable<FilmApplicationStagesTable> {

	public static final FilmApplicationStagesTable INSTANCE =
		new FilmApplicationStagesTable();

	public final Column<FilmApplicationStagesTable, Long>
		filmApplicationStagesId = createColumn(
			"filmApplicationStagesId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmApplicationStagesTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, String> stageName =
		createColumn(
			"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, String> duration =
		createColumn(
			"duration", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, String> stageStatus =
		createColumn(
			"stageStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Date> stageStartDate =
		createColumn(
			"stageStartDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Date> stageEndDate =
		createColumn(
			"stageEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationStagesTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private FilmApplicationStagesTable() {
		super("nbp_film_app_stages", FilmApplicationStagesTable::new);
	}

}