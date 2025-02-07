/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_recall&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaRecallForm
 * @generated
 */
public class PharmaRecallFormTable extends BaseTable<PharmaRecallFormTable> {

	public static final PharmaRecallFormTable INSTANCE =
		new PharmaRecallFormTable();

	public final Column<PharmaRecallFormTable, Long> pharmaRecallFormId =
		createColumn(
			"pharmaRecallFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaRecallFormTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, String> nameOfLicenseHolder =
		createColumn(
			"nameOfLicenseHolder", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, Date> dateOfRecall =
		createColumn(
			"dateOfRecall", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, String> initiatedBy =
		createColumn(
			"initiatedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, String> typeOfRecall =
		createColumn(
			"typeOfRecall", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, String> licenseNumber =
		createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaRecallFormTable, Long> pharmaApplicationId =
		createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaRecallFormTable() {
		super("nbp_pharma_recall", PharmaRecallFormTable::new);
	}

}