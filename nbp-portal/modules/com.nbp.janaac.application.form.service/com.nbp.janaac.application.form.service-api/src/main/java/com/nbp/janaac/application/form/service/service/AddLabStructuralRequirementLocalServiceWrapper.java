/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabStructuralRequirementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabStructuralRequirementLocalService
 * @generated
 */
public class AddLabStructuralRequirementLocalServiceWrapper
	implements AddLabStructuralRequirementLocalService,
			   ServiceWrapper<AddLabStructuralRequirementLocalService> {

	public AddLabStructuralRequirementLocalServiceWrapper() {
		this(null);
	}

	public AddLabStructuralRequirementLocalServiceWrapper(
		AddLabStructuralRequirementLocalService
			addLabStructuralRequirementLocalService) {

		_addLabStructuralRequirementLocalService =
			addLabStructuralRequirementLocalService;
	}

	/**
	 * Adds the add lab structural requirement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 * @return the add lab structural requirement that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement addAddLabStructuralRequirement(
				com.nbp.janaac.application.form.service.model.
					AddLabStructuralRequirement addLabStructuralRequirement) {

		return _addLabStructuralRequirementLocalService.
			addAddLabStructuralRequirement(addLabStructuralRequirement);
	}

	/**
	 * Creates a new add lab structural requirement with the primary key. Does not add the add lab structural requirement to the database.
	 *
	 * @param addLabStructuralRequirementId the primary key for the new add lab structural requirement
	 * @return the new add lab structural requirement
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement createAddLabStructuralRequirement(
				long addLabStructuralRequirementId) {

		return _addLabStructuralRequirementLocalService.
			createAddLabStructuralRequirement(addLabStructuralRequirementId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabStructuralRequirementLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab structural requirement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement deleteAddLabStructuralRequirement(
				com.nbp.janaac.application.form.service.model.
					AddLabStructuralRequirement addLabStructuralRequirement) {

		return _addLabStructuralRequirementLocalService.
			deleteAddLabStructuralRequirement(addLabStructuralRequirement);
	}

	/**
	 * Deletes the add lab structural requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 * @throws PortalException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement deleteAddLabStructuralRequirement(
					long addLabStructuralRequirementId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabStructuralRequirementLocalService.
			deleteAddLabStructuralRequirement(addLabStructuralRequirementId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabStructuralRequirementLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabStructuralRequirementLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabStructuralRequirementLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabStructuralRequirementLocalService.dynamicQuery();
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

		return _addLabStructuralRequirementLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl</code>.
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

		return _addLabStructuralRequirementLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl</code>.
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

		return _addLabStructuralRequirementLocalService.dynamicQuery(
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

		return _addLabStructuralRequirementLocalService.dynamicQueryCount(
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

		return _addLabStructuralRequirementLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement fetchAddLabStructuralRequirement(
				long addLabStructuralRequirementId) {

		return _addLabStructuralRequirementLocalService.
			fetchAddLabStructuralRequirement(addLabStructuralRequirementId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabStructuralRequirementLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab structural requirement with the primary key.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement
	 * @throws PortalException if a add lab structural requirement with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement getAddLabStructuralRequirement(
					long addLabStructuralRequirementId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabStructuralRequirementLocalService.
			getAddLabStructuralRequirement(addLabStructuralRequirementId);
	}

	/**
	 * Returns a range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @return the range of add lab structural requirements
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement> getAddLabStructuralRequirements(
				int start, int end) {

		return _addLabStructuralRequirementLocalService.
			getAddLabStructuralRequirements(start, end);
	}

	/**
	 * Returns the number of add lab structural requirements.
	 *
	 * @return the number of add lab structural requirements
	 */
	@Override
	public int getAddLabStructuralRequirementsCount() {
		return _addLabStructuralRequirementLocalService.
			getAddLabStructuralRequirementsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabStructuralRequirementLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement> getJanaacById(
				long janaacApplicationId) {

		return _addLabStructuralRequirementLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabStructuralRequirementLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabStructuralRequirementLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab structural requirement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 * @return the add lab structural requirement that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.
			AddLabStructuralRequirement updateAddLabStructuralRequirement(
				com.nbp.janaac.application.form.service.model.
					AddLabStructuralRequirement addLabStructuralRequirement) {

		return _addLabStructuralRequirementLocalService.
			updateAddLabStructuralRequirement(addLabStructuralRequirement);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabStructuralRequirementLocalService.getBasePersistence();
	}

	@Override
	public AddLabStructuralRequirementLocalService getWrappedService() {
		return _addLabStructuralRequirementLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabStructuralRequirementLocalService
			addLabStructuralRequirementLocalService) {

		_addLabStructuralRequirementLocalService =
			addLabStructuralRequirementLocalService;
	}

	private AddLabStructuralRequirementLocalService
		_addLabStructuralRequirementLocalService;

}