/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationLocalService
 * @generated
 */
public class PharmaDeskVerificationLocalServiceWrapper
	implements PharmaDeskVerificationLocalService,
			   ServiceWrapper<PharmaDeskVerificationLocalService> {

	public PharmaDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public PharmaDeskVerificationLocalServiceWrapper(
		PharmaDeskVerificationLocalService pharmaDeskVerificationLocalService) {

		_pharmaDeskVerificationLocalService =
			pharmaDeskVerificationLocalService;
	}

	/**
	 * Adds the pharma desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 * @return the pharma desk verification that was added
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
		addPharmaDeskVerification(
			com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
				pharmaDeskVerification) {

		return _pharmaDeskVerificationLocalService.addPharmaDeskVerification(
			pharmaDeskVerification);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma desk verification with the primary key. Does not add the pharma desk verification to the database.
	 *
	 * @param pharmaDeskVerificationId the primary key for the new pharma desk verification
	 * @return the new pharma desk verification
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
		createPharmaDeskVerification(long pharmaDeskVerificationId) {

		return _pharmaDeskVerificationLocalService.createPharmaDeskVerification(
			pharmaDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification that was removed
	 * @throws PortalException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
			deletePharmaDeskVerification(long pharmaDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDeskVerificationLocalService.deletePharmaDeskVerification(
			pharmaDeskVerificationId);
	}

	/**
	 * Deletes the pharma desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 * @return the pharma desk verification that was removed
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
		deletePharmaDeskVerification(
			com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
				pharmaDeskVerification) {

		return _pharmaDeskVerificationLocalService.deletePharmaDeskVerification(
			pharmaDeskVerification);
	}

	@Override
	public void deletePharmaDeskVerificationId(long pharmaApplicationId) {
		_pharmaDeskVerificationLocalService.deletePharmaDeskVerificationId(
			pharmaApplicationId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaDeskVerificationLocalService.dynamicQuery();
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

		return _pharmaDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl</code>.
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

		return _pharmaDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl</code>.
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

		return _pharmaDeskVerificationLocalService.dynamicQuery(
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

		return _pharmaDeskVerificationLocalService.dynamicQueryCount(
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

		return _pharmaDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
		fetchPharmaDeskVerification(long pharmaDeskVerificationId) {

		return _pharmaDeskVerificationLocalService.fetchPharmaDeskVerification(
			pharmaDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaDeskVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification>
			getDeskVerificationPharmaById(long pharmaApplicationId) {

		return _pharmaDeskVerificationLocalService.
			getDeskVerificationPharmaById(pharmaApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma desk verification with the primary key.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification
	 * @throws PortalException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
			getPharmaDeskVerification(long pharmaDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaDeskVerificationLocalService.getPharmaDeskVerification(
			pharmaDeskVerificationId);
	}

	/**
	 * Returns a range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of pharma desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification>
			getPharmaDeskVerifications(int start, int end) {

		return _pharmaDeskVerificationLocalService.getPharmaDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of pharma desk verifications.
	 *
	 * @return the number of pharma desk verifications
	 */
	@Override
	public int getPharmaDeskVerificationsCount() {
		return _pharmaDeskVerificationLocalService.
			getPharmaDeskVerificationsCount();
	}

	/**
	 * Updates the pharma desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 * @return the pharma desk verification that was updated
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
		updatePharmaDeskVerification(
			com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification
				pharmaDeskVerification) {

		return _pharmaDeskVerificationLocalService.updatePharmaDeskVerification(
			pharmaDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public PharmaDeskVerificationLocalService getWrappedService() {
		return _pharmaDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaDeskVerificationLocalService pharmaDeskVerificationLocalService) {

		_pharmaDeskVerificationLocalService =
			pharmaDeskVerificationLocalService;
	}

	private PharmaDeskVerificationLocalService
		_pharmaDeskVerificationLocalService;

}