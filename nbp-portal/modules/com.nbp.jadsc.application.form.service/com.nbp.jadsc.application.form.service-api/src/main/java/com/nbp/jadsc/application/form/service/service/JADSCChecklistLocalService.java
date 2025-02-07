/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCChecklist;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for JADSCChecklist. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface JADSCChecklistLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the jadsc checklist local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link JADSCChecklistLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the jadsc checklist to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JADSCChecklist addJADSCChecklist(JADSCChecklist jadscChecklist);

	/**
	 * Creates a new jadsc checklist with the primary key. Does not add the jadsc checklist to the database.
	 *
	 * @param jadscChecklistId the primary key for the new jadsc checklist
	 * @return the new jadsc checklist
	 */
	@Transactional(enabled = false)
	public JADSCChecklist createJADSCChecklist(long jadscChecklistId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the jadsc checklist from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public JADSCChecklist deleteJADSCChecklist(JADSCChecklist jadscChecklist);

	/**
	 * Deletes the jadsc checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist that was removed
	 * @throws PortalException if a jadsc checklist with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public JADSCChecklist deleteJADSCChecklist(long jadscChecklistId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCChecklist fetchJADSCChecklist(long jadscChecklistId);

	/**
	 * Returns the jadsc checklist matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCChecklist fetchJADSCChecklistByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCChecklist> getJADSC_ByAppId(long jadscApplicationId);

	/**
	 * Returns the jadsc checklist with the primary key.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist
	 * @throws PortalException if a jadsc checklist with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCChecklist getJADSCChecklist(long jadscChecklistId)
		throws PortalException;

	/**
	 * Returns the jadsc checklist matching the UUID and group.
	 *
	 * @param uuid the jadsc checklist's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc checklist
	 * @throws PortalException if a matching jadsc checklist could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JADSCChecklist getJADSCChecklistByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of jadsc checklists
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCChecklist> getJADSCChecklists(int start, int end);

	/**
	 * Returns all the jadsc checklists matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklists
	 * @param companyId the primary key of the company
	 * @return the matching jadsc checklists, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCChecklist> getJADSCChecklistsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of jadsc checklists matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc checklists
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc checklists, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<JADSCChecklist> getJADSCChecklistsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCChecklist> orderByComparator);

	/**
	 * Returns the number of jadsc checklists.
	 *
	 * @return the number of jadsc checklists
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJADSCChecklistsCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the jadsc checklist in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCChecklistLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscChecklist the jadsc checklist
	 * @return the jadsc checklist that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public JADSCChecklist updateJADSCChecklist(JADSCChecklist jadscChecklist);

}