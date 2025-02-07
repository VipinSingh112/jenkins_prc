/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisSupportingDocumentsMaster service. Represents a row in the &quot;nbp_cannabis_supporting_docs&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMasterModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterImpl"
)
@ProviderType
public interface CannabisSupportingDocumentsMaster
	extends CannabisSupportingDocumentsMasterModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.cannabis.application.form.services.model.impl.CannabisSupportingDocumentsMasterImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisSupportingDocumentsMaster, Long>
		CANNABIS_SUPPORTING_DOC_MASTER_ID_ACCESSOR =
			new Accessor<CannabisSupportingDocumentsMaster, Long>() {

				@Override
				public Long get(
					CannabisSupportingDocumentsMaster
						cannabisSupportingDocumentsMaster) {

					return cannabisSupportingDocumentsMaster.
						getCannabisSupportingDocMasterId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisSupportingDocumentsMaster> getTypeClass() {
					return CannabisSupportingDocumentsMaster.class;
				}

			};

}