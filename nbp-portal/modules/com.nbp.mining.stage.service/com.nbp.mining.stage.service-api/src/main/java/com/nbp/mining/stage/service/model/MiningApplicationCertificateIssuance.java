/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiningApplicationCertificateIssuance service. Represents a row in the &quot;nbp_mining_cert_issue&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationCertificateIssuanceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceImpl"
)
@ProviderType
public interface MiningApplicationCertificateIssuance
	extends MiningApplicationCertificateIssuanceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.stage.service.model.impl.MiningApplicationCertificateIssuanceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningApplicationCertificateIssuance, Long>
		MINING_CERT_ISSU_ID_ACCESSOR =
			new Accessor<MiningApplicationCertificateIssuance, Long>() {

				@Override
				public Long get(
					MiningApplicationCertificateIssuance
						miningApplicationCertificateIssuance) {

					return miningApplicationCertificateIssuance.
						getMiningCertIssuId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningApplicationCertificateIssuance>
					getTypeClass() {

					return MiningApplicationCertificateIssuance.class;
				}

			};

}