/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the sezSubmissionChecklist service. Represents a row in the &quot;nbp_sez_dev_sub_checklist&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklistModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistImpl"
)
@ProviderType
public interface sezSubmissionChecklist
	extends PersistedModel, sezSubmissionChecklistModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<sezSubmissionChecklist, Long>
		SEZ_SUBMISSION_CHECKLIST_ID_ACCESSOR =
			new Accessor<sezSubmissionChecklist, Long>() {

				@Override
				public Long get(sezSubmissionChecklist sezSubmissionChecklist) {
					return sezSubmissionChecklist.getSezSubmissionChecklistId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<sezSubmissionChecklist> getTypeClass() {
					return sezSubmissionChecklist.class;
				}

			};

}