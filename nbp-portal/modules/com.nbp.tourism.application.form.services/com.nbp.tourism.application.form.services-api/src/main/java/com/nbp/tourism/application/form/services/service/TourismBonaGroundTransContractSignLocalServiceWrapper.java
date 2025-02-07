/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransContractSignLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransContractSignLocalService
 * @generated
 */
public class TourismBonaGroundTransContractSignLocalServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransContractSignLocalService>,
			   TourismBonaGroundTransContractSignLocalService {

	public TourismBonaGroundTransContractSignLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransContractSignLocalServiceWrapper(
		TourismBonaGroundTransContractSignLocalService
			tourismBonaGroundTransContractSignLocalService) {

		_tourismBonaGroundTransContractSignLocalService =
			tourismBonaGroundTransContractSignLocalService;
	}

	/**
	 * Adds the tourism bona ground trans contract sign to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransContractSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransContractSign the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
			addTourismBonaGroundTransContractSign(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransContractSign
						tourismBonaGroundTransContractSign) {

		return _tourismBonaGroundTransContractSignLocalService.
			addTourismBonaGroundTransContractSign(
				tourismBonaGroundTransContractSign);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransContractSignLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground trans contract sign with the primary key. Does not add the tourism bona ground trans contract sign to the database.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key for the new tourism bona ground trans contract sign
	 * @return the new tourism bona ground trans contract sign
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
			createTourismBonaGroundTransContractSign(
				long tourismBonaGroTraCoSignId) {

		return _tourismBonaGroundTransContractSignLocalService.
			createTourismBonaGroundTransContractSign(tourismBonaGroTraCoSignId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransContractSignLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona ground trans contract sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransContractSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was removed
	 * @throws PortalException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
				deleteTourismBonaGroundTransContractSign(
					long tourismBonaGroTraCoSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransContractSignLocalService.
			deleteTourismBonaGroundTransContractSign(tourismBonaGroTraCoSignId);
	}

	/**
	 * Deletes the tourism bona ground trans contract sign from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransContractSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransContractSign the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
			deleteTourismBonaGroundTransContractSign(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransContractSign
						tourismBonaGroundTransContractSign) {

		return _tourismBonaGroundTransContractSignLocalService.
			deleteTourismBonaGroundTransContractSign(
				tourismBonaGroundTransContractSign);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundTransContractSignLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundTransContractSignLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundTransContractSignLocalService.dynamicQuery();
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

		return _tourismBonaGroundTransContractSignLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransContractSignModelImpl</code>.
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

		return _tourismBonaGroundTransContractSignLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransContractSignModelImpl</code>.
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

		return _tourismBonaGroundTransContractSignLocalService.dynamicQuery(
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

		return _tourismBonaGroundTransContractSignLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _tourismBonaGroundTransContractSignLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
			fetchTourismBonaGroundTransContractSign(
				long tourismBonaGroTraCoSignId) {

		return _tourismBonaGroundTransContractSignLocalService.
			fetchTourismBonaGroundTransContractSign(tourismBonaGroTraCoSignId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundTransContractSignLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundTransContractSignLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransContractSignLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransContractSignLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign
	 * @throws PortalException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
				getTourismBonaGroundTransContractSign(
					long tourismBonaGroTraCoSignId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransContractSignLocalService.
			getTourismBonaGroundTransContractSign(tourismBonaGroTraCoSignId);
	}

	/**
	 * Returns a range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @return the range of tourism bona ground trans contract signs
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransContractSign>
				getTourismBonaGroundTransContractSigns(int start, int end) {

		return _tourismBonaGroundTransContractSignLocalService.
			getTourismBonaGroundTransContractSigns(start, end);
	}

	/**
	 * Returns the number of tourism bona ground trans contract signs.
	 *
	 * @return the number of tourism bona ground trans contract signs
	 */
	@Override
	public int getTourismBonaGroundTransContractSignsCount() {
		return _tourismBonaGroundTransContractSignLocalService.
			getTourismBonaGroundTransContractSignsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign getTourismById(
				long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismBonaGroundTransContractSignException {

		return _tourismBonaGroundTransContractSignLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground trans contract sign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransContractSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransContractSign the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransContractSign
			updateTourismBonaGroundTransContractSign(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransContractSign
						tourismBonaGroundTransContractSign) {

		return _tourismBonaGroundTransContractSignLocalService.
			updateTourismBonaGroundTransContractSign(
				tourismBonaGroundTransContractSign);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundTransContractSignLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaGroundTransContractSignLocalService getWrappedService() {
		return _tourismBonaGroundTransContractSignLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransContractSignLocalService
			tourismBonaGroundTransContractSignLocalService) {

		_tourismBonaGroundTransContractSignLocalService =
			tourismBonaGroundTransContractSignLocalService;
	}

	private TourismBonaGroundTransContractSignLocalService
		_tourismBonaGroundTransContractSignLocalService;

}