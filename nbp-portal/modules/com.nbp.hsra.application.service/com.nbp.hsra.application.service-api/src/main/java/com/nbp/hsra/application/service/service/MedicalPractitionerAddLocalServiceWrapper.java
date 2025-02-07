/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalPractitionerAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPractitionerAddLocalService
 * @generated
 */
public class MedicalPractitionerAddLocalServiceWrapper
	implements MedicalPractitionerAddLocalService,
			   ServiceWrapper<MedicalPractitionerAddLocalService> {

	public MedicalPractitionerAddLocalServiceWrapper() {
		this(null);
	}

	public MedicalPractitionerAddLocalServiceWrapper(
		MedicalPractitionerAddLocalService medicalPractitionerAddLocalService) {

		_medicalPractitionerAddLocalService =
			medicalPractitionerAddLocalService;
	}

	/**
	 * Adds the medical practitioner add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPractitionerAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPractitionerAdd the medical practitioner add
	 * @return the medical practitioner add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
		addMedicalPractitionerAdd(
			com.nbp.hsra.application.service.model.MedicalPractitionerAdd
				medicalPractitionerAdd) {

		return _medicalPractitionerAddLocalService.addMedicalPractitionerAdd(
			medicalPractitionerAdd);
	}

	/**
	 * Creates a new medical practitioner add with the primary key. Does not add the medical practitioner add to the database.
	 *
	 * @param medicalPractitionerAddId the primary key for the new medical practitioner add
	 * @return the new medical practitioner add
	 */
	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
		createMedicalPractitionerAdd(long medicalPractitionerAddId) {

		return _medicalPractitionerAddLocalService.createMedicalPractitionerAdd(
			medicalPractitionerAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPractitionerAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical practitioner add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPractitionerAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add that was removed
	 * @throws PortalException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
			deleteMedicalPractitionerAdd(long medicalPractitionerAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPractitionerAddLocalService.deleteMedicalPractitionerAdd(
			medicalPractitionerAddId);
	}

	/**
	 * Deletes the medical practitioner add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPractitionerAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPractitionerAdd the medical practitioner add
	 * @return the medical practitioner add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
		deleteMedicalPractitionerAdd(
			com.nbp.hsra.application.service.model.MedicalPractitionerAdd
				medicalPractitionerAdd) {

		return _medicalPractitionerAddLocalService.deleteMedicalPractitionerAdd(
			medicalPractitionerAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPractitionerAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalPractitionerAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalPractitionerAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalPractitionerAddLocalService.dynamicQuery();
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

		return _medicalPractitionerAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.MedicalPractitionerAddModelImpl</code>.
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

		return _medicalPractitionerAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.MedicalPractitionerAddModelImpl</code>.
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

		return _medicalPractitionerAddLocalService.dynamicQuery(
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

		return _medicalPractitionerAddLocalService.dynamicQueryCount(
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

		return _medicalPractitionerAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
		fetchMedicalPractitionerAdd(long medicalPractitionerAddId) {

		return _medicalPractitionerAddLocalService.fetchMedicalPractitionerAdd(
			medicalPractitionerAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalPractitionerAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.MedicalPractitionerAdd>
			getHsraById(long hsraApplicationId) {

		return _medicalPractitionerAddLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalPractitionerAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medical practitioner add with the primary key.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add
	 * @throws PortalException if a medical practitioner add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
			getMedicalPractitionerAdd(long medicalPractitionerAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPractitionerAddLocalService.getMedicalPractitionerAdd(
			medicalPractitionerAddId);
	}

	/**
	 * Returns a range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @return the range of medical practitioner adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.MedicalPractitionerAdd>
			getMedicalPractitionerAdds(int start, int end) {

		return _medicalPractitionerAddLocalService.getMedicalPractitionerAdds(
			start, end);
	}

	/**
	 * Returns the number of medical practitioner adds.
	 *
	 * @return the number of medical practitioner adds
	 */
	@Override
	public int getMedicalPractitionerAddsCount() {
		return _medicalPractitionerAddLocalService.
			getMedicalPractitionerAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalPractitionerAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalPractitionerAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical practitioner add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPractitionerAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPractitionerAdd the medical practitioner add
	 * @return the medical practitioner add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.MedicalPractitionerAdd
		updateMedicalPractitionerAdd(
			com.nbp.hsra.application.service.model.MedicalPractitionerAdd
				medicalPractitionerAdd) {

		return _medicalPractitionerAddLocalService.updateMedicalPractitionerAdd(
			medicalPractitionerAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalPractitionerAddLocalService.getBasePersistence();
	}

	@Override
	public MedicalPractitionerAddLocalService getWrappedService() {
		return _medicalPractitionerAddLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalPractitionerAddLocalService medicalPractitionerAddLocalService) {

		_medicalPractitionerAddLocalService =
			medicalPractitionerAddLocalService;
	}

	private MedicalPractitionerAddLocalService
		_medicalPractitionerAddLocalService;

}