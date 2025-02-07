/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewGroundTransportationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundTransportationLocalService
 * @generated
 */
public class TourismNewGroundTransportationLocalServiceWrapper
	implements ServiceWrapper<TourismNewGroundTransportationLocalService>,
			   TourismNewGroundTransportationLocalService {

	public TourismNewGroundTransportationLocalServiceWrapper() {
		this(null);
	}

	public TourismNewGroundTransportationLocalServiceWrapper(
		TourismNewGroundTransportationLocalService
			tourismNewGroundTransportationLocalService) {

		_tourismNewGroundTransportationLocalService =
			tourismNewGroundTransportationLocalService;
	}

	/**
	 * Adds the tourism new ground transportation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewGroundTransportation the tourism new ground transportation
	 * @return the tourism new ground transportation that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation addTourismNewGroundTransportation(
			com.nbp.tourism.application.form.services.model.
				TourismNewGroundTransportation tourismNewGroundTransportation) {

		return _tourismNewGroundTransportationLocalService.
			addTourismNewGroundTransportation(tourismNewGroundTransportation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundTransportationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new ground transportation with the primary key. Does not add the tourism new ground transportation to the database.
	 *
	 * @param TourismNewGroundTransId the primary key for the new tourism new ground transportation
	 * @return the new tourism new ground transportation
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation createTourismNewGroundTransportation(
			long TourismNewGroundTransId) {

		return _tourismNewGroundTransportationLocalService.
			createTourismNewGroundTransportation(TourismNewGroundTransId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundTransportationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation that was removed
	 * @throws PortalException if a tourism new ground transportation with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation deleteTourismNewGroundTransportation(
				long TourismNewGroundTransId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundTransportationLocalService.
			deleteTourismNewGroundTransportation(TourismNewGroundTransId);
	}

	/**
	 * Deletes the tourism new ground transportation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewGroundTransportation the tourism new ground transportation
	 * @return the tourism new ground transportation that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation deleteTourismNewGroundTransportation(
			com.nbp.tourism.application.form.services.model.
				TourismNewGroundTransportation tourismNewGroundTransportation) {

		return _tourismNewGroundTransportationLocalService.
			deleteTourismNewGroundTransportation(
				tourismNewGroundTransportation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewGroundTransportationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewGroundTransportationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewGroundTransportationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _tourismNewGroundTransportationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _tourismNewGroundTransportationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _tourismNewGroundTransportationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _tourismNewGroundTransportationLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _tourismNewGroundTransportationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation fetchTourismNewGroundTransportation(
			long TourismNewGroundTransId) {

		return _tourismNewGroundTransportationLocalService.
			fetchTourismNewGroundTransportation(TourismNewGroundTransId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewGroundTransportationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewGroundTransportationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewGroundTransportationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundTransportationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismNewGroundTransportationException {

		return _tourismNewGroundTransportationLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new ground transportation with the primary key.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation
	 * @throws PortalException if a tourism new ground transportation with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation getTourismNewGroundTransportation(
				long TourismNewGroundTransId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundTransportationLocalService.
			getTourismNewGroundTransportation(TourismNewGroundTransId);
	}

	/**
	 * Returns a range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @return the range of tourism new ground transportations
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewGroundTransportation> getTourismNewGroundTransportations(
				int start, int end) {

		return _tourismNewGroundTransportationLocalService.
			getTourismNewGroundTransportations(start, end);
	}

	/**
	 * Returns the number of tourism new ground transportations.
	 *
	 * @return the number of tourism new ground transportations
	 */
	@Override
	public int getTourismNewGroundTransportationsCount() {
		return _tourismNewGroundTransportationLocalService.
			getTourismNewGroundTransportationsCount();
	}

	/**
	 * Updates the tourism new ground transportation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewGroundTransportation the tourism new ground transportation
	 * @return the tourism new ground transportation that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewGroundTransportation updateTourismNewGroundTransportation(
			com.nbp.tourism.application.form.services.model.
				TourismNewGroundTransportation tourismNewGroundTransportation) {

		return _tourismNewGroundTransportationLocalService.
			updateTourismNewGroundTransportation(
				tourismNewGroundTransportation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewGroundTransportationLocalService.getBasePersistence();
	}

	@Override
	public TourismNewGroundTransportationLocalService getWrappedService() {
		return _tourismNewGroundTransportationLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewGroundTransportationLocalService
			tourismNewGroundTransportationLocalService) {

		_tourismNewGroundTransportationLocalService =
			tourismNewGroundTransportationLocalService;
	}

	private TourismNewGroundTransportationLocalService
		_tourismNewGroundTransportationLocalService;

}