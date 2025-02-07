/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_quality_declare&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualityDeclarationInfo
 * @generated
 */
public class QualityDeclarationInfoTable
	extends BaseTable<QualityDeclarationInfoTable> {

	public static final QualityDeclarationInfoTable INSTANCE =
		new QualityDeclarationInfoTable();

	public final Column<QualityDeclarationInfoTable, Long>
		qualityDeclarationInfoId = createColumn(
			"qualityDeclarationInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualityDeclarationInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, Date> declarationSignDate =
		createColumn(
			"declarationSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<QualityDeclarationInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualityDeclarationInfoTable() {
		super("nbp_hsra_quality_declare", QualityDeclarationInfoTable::new);
	}

}