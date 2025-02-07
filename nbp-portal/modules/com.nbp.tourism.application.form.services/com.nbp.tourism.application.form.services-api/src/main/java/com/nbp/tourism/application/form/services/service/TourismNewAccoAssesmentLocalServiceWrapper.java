/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAccoAssesmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentLocalService
 * @generated
 */
public class TourismNewAccoAssesmentLocalServiceWrapper
	implements ServiceWrapper<TourismNewAccoAssesmentLocalService>,
			   TourismNewAccoAssesmentLocalService {

	public TourismNewAccoAssesmentLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAccoAssesmentLocalServiceWrapper(
		TourismNewAccoAssesmentLocalService
			tourismNewAccoAssesmentLocalService) {

		_tourismNewAccoAssesmentLocalService =
			tourismNewAccoAssesmentLocalService;
	}

	/**
	 * Adds the tourism new acco assesment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoAssesment the tourism new acco assesment
	 * @return the tourism new acco assesment that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
			addTourismNewAccoAssesment(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccoAssesment tourismNewAccoAssesment) {

		return _tourismNewAccoAssesmentLocalService.addTourismNewAccoAssesment(
			tourismNewAccoAssesment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoAssesmentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new acco assesment with the primary key. Does not add the tourism new acco assesment to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment
	 * @return the new tourism new acco assesment
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
			createTourismNewAccoAssesment(long TourismNewAccoAssesmentInfoId) {

		return _tourismNewAccoAssesmentLocalService.
			createTourismNewAccoAssesment(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoAssesmentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment that was removed
	 * @throws PortalException if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
				deleteTourismNewAccoAssesment(
					long TourismNewAccoAssesmentInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoAssesmentLocalService.
			deleteTourismNewAccoAssesment(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Deletes the tourism new acco assesment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoAssesment the tourism new acco assesment
	 * @return the tourism new acco assesment that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
			deleteTourismNewAccoAssesment(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccoAssesment tourismNewAccoAssesment) {

		return _tourismNewAccoAssesmentLocalService.
			deleteTourismNewAccoAssesment(tourismNewAccoAssesment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAccoAssesmentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAccoAssesmentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAccoAssesmentLocalService.dynamicQuery();
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

		return _tourismNewAccoAssesmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentModelImpl</code>.
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

		return _tourismNewAccoAssesmentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentModelImpl</code>.
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

		return _tourismNewAccoAssesmentLocalService.dynamicQuery(
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

		return _tourismNewAccoAssesmentLocalService.dynamicQueryCount(
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

		return _tourismNewAccoAssesmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
			fetchTourismNewAccoAssesment(long TourismNewAccoAssesmentInfoId) {

		return _tourismNewAccoAssesmentLocalService.
			fetchTourismNewAccoAssesment(TourismNewAccoAssesmentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAccoAssesmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAccoAssesmentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccoAssesmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoAssesmentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
				getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismNewAccoAssesmentException {

		return _tourismNewAccoAssesmentLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco assesment with the primary key.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment
	 * @throws PortalException if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
				getTourismNewAccoAssesment(long TourismNewAccoAssesmentInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoAssesmentLocalService.getTourismNewAccoAssesment(
			TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns a range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @return the range of tourism new acco assesments
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAccoAssesment> getTourismNewAccoAssesments(
				int start, int end) {

		return _tourismNewAccoAssesmentLocalService.getTourismNewAccoAssesments(
			start, end);
	}

	/**
	 * Returns the number of tourism new acco assesments.
	 *
	 * @return the number of tourism new acco assesments
	 */
	@Override
	public int getTourismNewAccoAssesmentsCount() {
		return _tourismNewAccoAssesmentLocalService.
			getTourismNewAccoAssesmentsCount();
	}

	/**
	 * Updates the tourism new acco assesment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoAssesment the tourism new acco assesment
	 * @return the tourism new acco assesment that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment
			updateTourismNewAccoAssesment(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccoAssesment tourismNewAccoAssesment) {

		return _tourismNewAccoAssesmentLocalService.
			updateTourismNewAccoAssesment(tourismNewAccoAssesment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAccoAssesmentLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAccoAssesmentLocalService getWrappedService() {
		return _tourismNewAccoAssesmentLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccoAssesmentLocalService
			tourismNewAccoAssesmentLocalService) {

		_tourismNewAccoAssesmentLocalService =
			tourismNewAccoAssesmentLocalService;
	}

	private TourismNewAccoAssesmentLocalService
		_tourismNewAccoAssesmentLocalService;

}