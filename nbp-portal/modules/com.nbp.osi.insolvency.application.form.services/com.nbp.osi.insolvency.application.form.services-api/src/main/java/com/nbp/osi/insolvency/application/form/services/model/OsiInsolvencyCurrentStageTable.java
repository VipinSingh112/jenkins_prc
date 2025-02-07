/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_insolv_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStage
 * @generated
 */
public class OsiInsolvencyCurrentStageTable
	extends BaseTable<OsiInsolvencyCurrentStageTable> {

	public static final OsiInsolvencyCurrentStageTable INSTANCE =
		new OsiInsolvencyCurrentStageTable();

	public final Column<OsiInsolvencyCurrentStageTable, Long>
		osiInsolvencyCurrentStageId = createColumn(
			"osiInsolvencyCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiInsolvencyCurrentStageTable, Long>
		osiInsolvencyStageId = createColumn(
			"osiInsolvencyStageId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, String> lastFormStage =
		createColumn(
			"lastFormStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyCurrentStageTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInsolvencyCurrentStageTable() {
		super(
			"nbp_osi_insolv_current_stage",
			OsiInsolvencyCurrentStageTable::new);
	}

}