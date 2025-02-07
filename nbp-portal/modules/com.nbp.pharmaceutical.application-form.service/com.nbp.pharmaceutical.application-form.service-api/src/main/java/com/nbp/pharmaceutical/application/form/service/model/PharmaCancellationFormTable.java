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
 * The table class for the &quot;nbp_pharma_cancel&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCancellationForm
 * @generated
 */
public class PharmaCancellationFormTable
	extends BaseTable<PharmaCancellationFormTable> {

	public static final PharmaCancellationFormTable INSTANCE =
		new PharmaCancellationFormTable();

	public final Column<PharmaCancellationFormTable, Long>
		pharmaCancellationFormId = createColumn(
			"pharmaCancellationFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaCancellationFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, String>
		nameOfLicenseHolder = createColumn(
			"nameOfLicenseHolder", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, Date> dateOfRecall =
		createColumn(
			"dateOfRecall", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, String> initiatedBy =
		createColumn(
			"initiatedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, String> licenseNumber =
		createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaCancellationFormTable, Long> pharmaApplicationId =
		createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaCancellationFormTable() {
		super("nbp_pharma_cancel", PharmaCancellationFormTable::new);
	}

}