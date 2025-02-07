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

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRental;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for TourismBonaGroundTransportatioCarRental. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRentalLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface TourismBonaGroundTransportatioCarRentalLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaGroundTransportatioCarRentalLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the tourism bona ground transportatio car rental local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link TourismBonaGroundTransportatioCarRentalLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the tourism bona ground transportatio car rental to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TourismBonaGroundTransportatioCarRental
		addTourismBonaGroundTransportatioCarRental(
			TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new tourism bona ground transportatio car rental with the primary key. Does not add the tourism bona ground transportatio car rental to the database.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key for the new tourism bona ground transportatio car rental
	 * @return the new tourism bona ground transportatio car rental
	 */
	@Transactional(enabled = false)
	public TourismBonaGroundTransportatioCarRental
		createTourismBonaGroundTransportatioCarRental(
			long tourismBonaGroundTransportCRId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the tourism bona ground transportatio car rental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 * @throws PortalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public TourismBonaGroundTransportatioCarRental
			deleteTourismBonaGroundTransportatioCarRental(
				long tourismBonaGroundTransportCRId)
		throws PortalException;

	/**
	 * Deletes the tourism bona ground transportatio car rental from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public TourismBonaGroundTransportatioCarRental
		deleteTourismBonaGroundTransportatioCarRental(
			TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental);

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code>.
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
	public TourismBonaGroundTransportatioCarRental
		fetchTourismBonaGroundTransportatioCarRental(
			long tourismBonaGroundTransportCRId);

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

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental
	 * @throws PortalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TourismBonaGroundTransportatioCarRental
			getTourismBonaGroundTransportatioCarRental(
				long tourismBonaGroundTransportCRId)
		throws PortalException;

	/**
	 * Returns a range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @return the range of tourism bona ground transportatio car rentals
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<TourismBonaGroundTransportatioCarRental>
		getTourismBonaGroundTransportatioCarRentals(int start, int end);

	/**
	 * Returns the number of tourism bona ground transportatio car rentals.
	 *
	 * @return the number of tourism bona ground transportatio car rentals
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTourismBonaGroundTransportatioCarRentalsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public TourismBonaGroundTransportatioCarRental getTourismById(
		long tourismApplicationId);

	/**
	 * Updates the tourism bona ground transportatio car rental in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public TourismBonaGroundTransportatioCarRental
		updateTourismBonaGroundTransportatioCarRental(
			TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental);

}