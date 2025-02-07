/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAccoAssesmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoAssesmentLocalService
 * @generated
 */
public class TourismBonaAccoAssesmentLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAccoAssesmentLocalService>,
			   TourismBonaAccoAssesmentLocalService {

	public TourismBonaAccoAssesmentLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAccoAssesmentLocalServiceWrapper(
		TourismBonaAccoAssesmentLocalService
			tourismBonaAccoAssesmentLocalService) {

		_tourismBonaAccoAssesmentLocalService =
			tourismBonaAccoAssesmentLocalService;
	}

	/**
	 * Adds the tourism bona acco assesment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoAssesment the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
			addTourismBonaAccoAssesment(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		return _tourismBonaAccoAssesmentLocalService.
			addTourismBonaAccoAssesment(tourismBonaAccoAssesment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoAssesmentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona acco assesment with the primary key. Does not add the tourism bona acco assesment to the database.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key for the new tourism bona acco assesment
	 * @return the new tourism bona acco assesment
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
			createTourismBonaAccoAssesment(long tourismBonaAccoAssesmentId) {

		return _tourismBonaAccoAssesmentLocalService.
			createTourismBonaAccoAssesment(tourismBonaAccoAssesmentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoAssesmentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was removed
	 * @throws PortalException if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
				deleteTourismBonaAccoAssesment(long tourismBonaAccoAssesmentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoAssesmentLocalService.
			deleteTourismBonaAccoAssesment(tourismBonaAccoAssesmentId);
	}

	/**
	 * Deletes the tourism bona acco assesment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoAssesment the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
			deleteTourismBonaAccoAssesment(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		return _tourismBonaAccoAssesmentLocalService.
			deleteTourismBonaAccoAssesment(tourismBonaAccoAssesment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAccoAssesmentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAccoAssesmentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAccoAssesmentLocalService.dynamicQuery();
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

		return _tourismBonaAccoAssesmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoAssesmentModelImpl</code>.
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

		return _tourismBonaAccoAssesmentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoAssesmentModelImpl</code>.
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

		return _tourismBonaAccoAssesmentLocalService.dynamicQuery(
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

		return _tourismBonaAccoAssesmentLocalService.dynamicQueryCount(
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

		return _tourismBonaAccoAssesmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
			fetchTourismBonaAccoAssesment(long tourismBonaAccoAssesmentId) {

		return _tourismBonaAccoAssesmentLocalService.
			fetchTourismBonaAccoAssesment(tourismBonaAccoAssesmentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAccoAssesmentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAccoAssesmentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccoAssesmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoAssesmentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona acco assesment with the primary key.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment
	 * @throws PortalException if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
				getTourismBonaAccoAssesment(long tourismBonaAccoAssesmentId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccoAssesmentLocalService.
			getTourismBonaAccoAssesment(tourismBonaAccoAssesmentId);
	}

	/**
	 * Returns a range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @return the range of tourism bona acco assesments
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAccoAssesment> getTourismBonaAccoAssesments(
				int start, int end) {

		return _tourismBonaAccoAssesmentLocalService.
			getTourismBonaAccoAssesments(start, end);
	}

	/**
	 * Returns the number of tourism bona acco assesments.
	 *
	 * @return the number of tourism bona acco assesments
	 */
	@Override
	public int getTourismBonaAccoAssesmentsCount() {
		return _tourismBonaAccoAssesmentLocalService.
			getTourismBonaAccoAssesmentsCount();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
				getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaAccoAssesmentException {

		return _tourismBonaAccoAssesmentLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona acco assesment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccoAssesmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccoAssesment the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment
			updateTourismBonaAccoAssesment(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		return _tourismBonaAccoAssesmentLocalService.
			updateTourismBonaAccoAssesment(tourismBonaAccoAssesment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAccoAssesmentLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaAccoAssesmentLocalService getWrappedService() {
		return _tourismBonaAccoAssesmentLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccoAssesmentLocalService
			tourismBonaAccoAssesmentLocalService) {

		_tourismBonaAccoAssesmentLocalService =
			tourismBonaAccoAssesmentLocalService;
	}

	private TourismBonaAccoAssesmentLocalService
		_tourismBonaAccoAssesmentLocalService;

}