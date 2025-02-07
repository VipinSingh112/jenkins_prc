/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

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

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosivesApplicationException;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for ExplosivesApplication. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ExplosivesApplicationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosivesApplicationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the explosives application local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ExplosivesApplicationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the explosives application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ExplosivesApplication addExplosivesApplication(
		ExplosivesApplication explosivesApplication);

	/**
	 * Creates a new explosives application with the primary key. Does not add the explosives application to the database.
	 *
	 * @param explosivesApplicationId the primary key for the new explosives application
	 * @return the new explosives application
	 */
	@Transactional(enabled = false)
	public ExplosivesApplication createExplosivesApplication(
		long explosivesApplicationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the explosives application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public ExplosivesApplication deleteExplosivesApplication(
		ExplosivesApplication explosivesApplication);

	/**
	 * Deletes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws PortalException if a explosives application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public ExplosivesApplication deleteExplosivesApplication(
			long explosivesApplicationId)
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
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
	public ExplosivesApplication fetchExplosivesApplication(
		long explosivesApplicationId);

	/**
	 * Returns the explosives application matching the UUID and group.
	 *
	 * @param uuid the explosives application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication fetchExplosivesApplicationByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosivesApplication> getExplosiveAppByStatusUser(
		int status, long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication getExplosiveByAppNo(String applicationNumber)
		throws NoSuchExplosivesApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication getExplosiveByCaseId(String caseId)
		throws NoSuchExplosivesApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication getExplosiveById(long factoriesApplicationId)
		throws NoSuchExplosivesApplicationException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosivesApplication> getExplosiveByStatus(int status);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<String> getExplosiveDistinctCategory();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication getExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchExplosivesApplicationException;

	/**
	 * Returns the explosives application with the primary key.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application
	 * @throws PortalException if a explosives application with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication getExplosivesApplication(
			long explosivesApplicationId)
		throws PortalException;

	/**
	 * Returns the explosives application matching the UUID and group.
	 *
	 * @param uuid the explosives application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosives application
	 * @throws PortalException if a matching explosives application could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExplosivesApplication getExplosivesApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of explosives applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosivesApplication> getExplosivesApplications(
		int start, int end);

	/**
	 * Returns all the explosives applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosives applications
	 * @param companyId the primary key of the company
	 * @return the matching explosives applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosivesApplication>
		getExplosivesApplicationsByUuidAndCompanyId(
			String uuid, long companyId);

	/**
	 * Returns a range of explosives applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosives applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosives applications, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ExplosivesApplication>
		getExplosivesApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosivesApplication> orderByComparator);

	/**
	 * Returns the number of explosives applications.
	 *
	 * @return the number of explosives applications
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getExplosivesApplicationsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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
	 * Updates the explosives application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ExplosivesApplication updateExplosivesApplication(
		ExplosivesApplication explosivesApplication);

}