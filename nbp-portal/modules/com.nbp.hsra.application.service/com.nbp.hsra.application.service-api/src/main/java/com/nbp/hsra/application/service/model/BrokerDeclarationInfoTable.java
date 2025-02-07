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
 * The table class for the &quot;nbp_hsra_broker_declare&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerDeclarationInfo
 * @generated
 */
public class BrokerDeclarationInfoTable
	extends BaseTable<BrokerDeclarationInfoTable> {

	public static final BrokerDeclarationInfoTable INSTANCE =
		new BrokerDeclarationInfoTable();

	public final Column<BrokerDeclarationInfoTable, Long> brokerDeclareInfoId =
		createColumn(
			"brokerDeclareInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<BrokerDeclarationInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, String> brokerOperatorName =
		createColumn(
			"brokerOperatorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, String> brokerTitle =
		createColumn(
			"brokerTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, Date> signDate =
		createColumn(
			"signDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BrokerDeclarationInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private BrokerDeclarationInfoTable() {
		super("nbp_hsra_broker_declare", BrokerDeclarationInfoTable::new);
	}

}