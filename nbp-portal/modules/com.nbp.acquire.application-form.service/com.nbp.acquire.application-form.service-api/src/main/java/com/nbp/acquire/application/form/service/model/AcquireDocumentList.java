/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AcquireDocumentList service. Represents a row in the &quot;nbp_acquire_document_list&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentListModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListImpl"
)
@ProviderType
public interface AcquireDocumentList
	extends AcquireDocumentListModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquireDocumentList, Long>
		ACQUIRE_DOCUMENT_LIST_ID_ACCESSOR =
			new Accessor<AcquireDocumentList, Long>() {

				@Override
				public Long get(AcquireDocumentList acquireDocumentList) {
					return acquireDocumentList.getAcquireDocumentListId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AcquireDocumentList> getTypeClass() {
					return AcquireDocumentList.class;
				}

			};

}