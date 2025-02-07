/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist;
import com.nbp.sez.status.application.form.service.service.sezSubmissionChecklistLocalServiceUtil;

/**
 * The extended model base implementation for the sezSubmissionChecklist service. Represents a row in the &quot;nbp_sez_dev_sub_checklist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link sezSubmissionChecklistImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklistImpl
 * @see sezSubmissionChecklist
 * @generated
 */
public abstract class sezSubmissionChecklistBaseImpl
	extends sezSubmissionChecklistModelImpl implements sezSubmissionChecklist {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez submission checklist model instance should use the <code>sezSubmissionChecklist</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			sezSubmissionChecklistLocalServiceUtil.addsezSubmissionChecklist(
				this);
		}
		else {
			sezSubmissionChecklistLocalServiceUtil.updatesezSubmissionChecklist(
				this);
		}
	}

}