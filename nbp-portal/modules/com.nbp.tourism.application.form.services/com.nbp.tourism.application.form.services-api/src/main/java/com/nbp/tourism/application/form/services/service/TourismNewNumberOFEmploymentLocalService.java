/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewNumberOFEmploymentException;
import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmployment;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for TourismNewNumberOFEmployment. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmploymentLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface TourismNewNumberOFEmploymentLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismNewNumberOFEmploymentLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the tourism new number of employment local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link TourismNewNumberOFEmploymentLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the tourism new number of employment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 * @return the tourism new number of employment that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TourismNewNumberOFEmployment addTourismNewNumberOFEmployment(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new tourism new number of employment with the primary key. Does not add the tourism new number of employment to the database.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key for the new tourism new number of employment
	 * @return the new tourism new number of employment
	 */
	@Transactional(enabled = false)
	public TourismNewNumberOFEmployment createTourismNewNumberOFEmployment(
		long tourismNewNumberOFEmploymentId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the tourism new number of employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 * @throws PortalException if a tourism new number of employment with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public TourismNewNumberOFEmployment deleteTourismNewNumberOFEmployment(
			long tourismNewNumberOFEmploymentId)
		throws PortalException;

	/**
	 * Deletes the tourism new number of employment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public TourismNewNumberOFEmployment deleteTourismNewNumberOFEmployment(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl</code>.
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
	public TourismNewNumberOFEmployment fetchTourismNewNumberOFEmployment(
		long tourismNewNumberOFEmploymentId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TourismNewNumberOFEmployment getTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewNumberOFEmploymentException;

	/**
	 * Returns the tourism new number of employment with the primary key.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment
	 * @throws PortalException if a tourism new number of employment with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TourismNewNumberOFEmployment getTourismNewNumberOFEmployment(
			long tourismNewNumberOFEmploymentId)
		throws PortalException;

	/**
	 * Returns a range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @return the range of tourism new number of employments
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TourismNewNumberOFEmployment> getTourismNewNumberOFEmployments(
		int start, int end);

	/**
	 * Returns the number of tourism new number of employments.
	 *
	 * @return the number of tourism new number of employments
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTourismNewNumberOFEmploymentsCount();

	/**
	 * Updates the tourism new number of employment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 * @return the tourism new number of employment that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TourismNewNumberOFEmployment updateTourismNewNumberOFEmployment(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment);

}