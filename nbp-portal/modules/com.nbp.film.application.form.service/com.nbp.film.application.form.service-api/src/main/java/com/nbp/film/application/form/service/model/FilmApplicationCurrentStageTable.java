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
 * The table class for the &quot;nbp_film_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationCurrentStage
 * @generated
 */
public class FilmApplicationCurrentStageTable
	extends BaseTable<FilmApplicationCurrentStageTable> {

	public static final FilmApplicationCurrentStageTable INSTANCE =
		new FilmApplicationCurrentStageTable();

	public final Column<FilmApplicationCurrentStageTable, Long>
		filmApplicationCurrentStageId = createColumn(
			"filmApplicationCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmApplicationCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, String>
		lastFormStage = createColumn(
			"lastFormStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationCurrentStageTable, Long>
		filmApplicationId = createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmApplicationCurrentStageTable() {
		super("nbp_film_stage", FilmApplicationCurrentStageTable::new);
	}

}