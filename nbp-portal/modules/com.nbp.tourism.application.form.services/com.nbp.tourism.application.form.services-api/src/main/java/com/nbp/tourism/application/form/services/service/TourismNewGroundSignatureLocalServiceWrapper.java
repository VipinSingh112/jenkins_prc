/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewGroundSignatureLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundSignatureLocalService
 * @generated
 */
public class TourismNewGroundSignatureLocalServiceWrapper
	implements ServiceWrapper<TourismNewGroundSignatureLocalService>,
			   TourismNewGroundSignatureLocalService {

	public TourismNewGroundSignatureLocalServiceWrapper() {
		this(null);
	}

	public TourismNewGroundSignatureLocalServiceWrapper(
		TourismNewGroundSignatureLocalService
			tourismNewGroundSignatureLocalService) {

		_tourismNewGroundSignatureLocalService =
			tourismNewGroundSignatureLocalService;
	}

	/**
	 * Adds the tourism new ground signature to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewGroundSignature the tourism new ground signature
	 * @return the tourism new ground signature that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature addTourismNewGroundSignature(
				com.nbp.tourism.application.form.services.model.
					TourismNewGroundSignature tourismNewGroundSignature) {

		return _tourismNewGroundSignatureLocalService.
			addTourismNewGroundSignature(tourismNewGroundSignature);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundSignatureLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new ground signature with the primary key. Does not add the tourism new ground signature to the database.
	 *
	 * @param TourismNewGroundSignatureId the primary key for the new tourism new ground signature
	 * @return the new tourism new ground signature
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature createTourismNewGroundSignature(
				long TourismNewGroundSignatureId) {

		return _tourismNewGroundSignatureLocalService.
			createTourismNewGroundSignature(TourismNewGroundSignatureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundSignatureLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new ground signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature that was removed
	 * @throws PortalException if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature deleteTourismNewGroundSignature(
					long TourismNewGroundSignatureId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundSignatureLocalService.
			deleteTourismNewGroundSignature(TourismNewGroundSignatureId);
	}

	/**
	 * Deletes the tourism new ground signature from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewGroundSignature the tourism new ground signature
	 * @return the tourism new ground signature that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature deleteTourismNewGroundSignature(
				com.nbp.tourism.application.form.services.model.
					TourismNewGroundSignature tourismNewGroundSignature) {

		return _tourismNewGroundSignatureLocalService.
			deleteTourismNewGroundSignature(tourismNewGroundSignature);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewGroundSignatureLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewGroundSignatureLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewGroundSignatureLocalService.dynamicQuery();
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

		return _tourismNewGroundSignatureLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewGroundSignatureModelImpl</code>.
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

		return _tourismNewGroundSignatureLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewGroundSignatureModelImpl</code>.
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

		return _tourismNewGroundSignatureLocalService.dynamicQuery(
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

		return _tourismNewGroundSignatureLocalService.dynamicQueryCount(
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

		return _tourismNewGroundSignatureLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature fetchTourismNewGroundSignature(
				long TourismNewGroundSignatureId) {

		return _tourismNewGroundSignatureLocalService.
			fetchTourismNewGroundSignature(TourismNewGroundSignatureId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewGroundSignatureLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewGroundSignatureLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewGroundSignatureLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundSignatureLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature getTourismById(long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismNewGroundSignatureException {

		return _tourismNewGroundSignatureLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new ground signature with the primary key.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature
	 * @throws PortalException if a tourism new ground signature with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature getTourismNewGroundSignature(
					long TourismNewGroundSignatureId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewGroundSignatureLocalService.
			getTourismNewGroundSignature(TourismNewGroundSignatureId);
	}

	/**
	 * Returns a range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @return the range of tourism new ground signatures
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature> getTourismNewGroundSignatures(
				int start, int end) {

		return _tourismNewGroundSignatureLocalService.
			getTourismNewGroundSignatures(start, end);
	}

	/**
	 * Returns the number of tourism new ground signatures.
	 *
	 * @return the number of tourism new ground signatures
	 */
	@Override
	public int getTourismNewGroundSignaturesCount() {
		return _tourismNewGroundSignatureLocalService.
			getTourismNewGroundSignaturesCount();
	}

	/**
	 * Updates the tourism new ground signature in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewGroundSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewGroundSignature the tourism new ground signature
	 * @return the tourism new ground signature that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewGroundSignature updateTourismNewGroundSignature(
				com.nbp.tourism.application.form.services.model.
					TourismNewGroundSignature tourismNewGroundSignature) {

		return _tourismNewGroundSignatureLocalService.
			updateTourismNewGroundSignature(tourismNewGroundSignature);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewGroundSignatureLocalService.getBasePersistence();
	}

	@Override
	public TourismNewGroundSignatureLocalService getWrappedService() {
		return _tourismNewGroundSignatureLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewGroundSignatureLocalService
			tourismNewGroundSignatureLocalService) {

		_tourismNewGroundSignatureLocalService =
			tourismNewGroundSignatureLocalService;
	}

	private TourismNewGroundSignatureLocalService
		_tourismNewGroundSignatureLocalService;

}