/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicationException;
import com.nbp.miic.application.form.services.model.MiicApplication;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for MiicApplication. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MiicApplicationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.miic.application.form.services.service.impl.MiicApplicationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the miic application local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MiicApplicationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the miic application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MiicApplication addMiicApplication(MiicApplication miicApplication);

	/**
	 * Creates a new miic application with the primary key. Does not add the miic application to the database.
	 *
	 * @param miicApplicationId the primary key for the new miic application
	 * @return the new miic application
	 */
	@Transactional(enabled = false)
	public MiicApplication createMiicApplication(long miicApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the miic application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application that was removed
	 * @throws PortalException if a miic application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public MiicApplication deleteMiicApplication(long miicApplicationId)
		throws PortalException;

	/**
	 * Deletes the miic application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public MiicApplication deleteMiicApplication(
		MiicApplication miicApplication);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
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
	public MiicApplication fetchMiicApplication(long miicApplicationId);

	/**
	 * Returns the miic application matching the UUID and group.
	 *
	 * @param uuid the miic application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication fetchMiicApplicationByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the miic application with the primary key.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application
	 * @throws PortalException if a miic application with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication getMiicApplication(long miicApplicationId)
		throws PortalException;

	/**
	 * Returns the miic application matching the UUID and group.
	 *
	 * @param uuid the miic application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application
	 * @throws PortalException if a matching miic application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication getMiicApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of miic applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMiicApplications(int start, int end);

	/**
	 * Returns all the miic applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic applications
	 * @param companyId the primary key of the company
	 * @return the matching miic applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMiicApplicationsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of miic applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching miic applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMiicApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator);

	/**
	 * Returns the number of miic applications.
	 *
	 * @return the number of miic applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMiicApplicationsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication getMIICByAppNo(String applicationNumber)
		throws NoSuchMiicApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication getMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchMiicApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication getMIICByEI_CI(String entityId, String caseId)
		throws NoSuchMiicApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMIICByEntityId(String entityId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMIICByEntityId_Status(
		String entityId, int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMIICByS_U(int status, long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MiicApplication> getMIICByStatus(int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getMiicDistinctCategories();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MiicApplication getMIICStatusByCaseId(String caseId)
		throws NoSuchMiicApplicationException;

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
	 * Updates the miic application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MiicApplication updateMiicApplication(
		MiicApplication miicApplication);

}