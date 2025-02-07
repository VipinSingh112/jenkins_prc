/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLaboratoryPartOfOrgLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLaboratoryPartOfOrgLocalService
 * @generated
 */
public class AddLaboratoryPartOfOrgLocalServiceWrapper
	implements AddLaboratoryPartOfOrgLocalService,
			   ServiceWrapper<AddLaboratoryPartOfOrgLocalService> {

	public AddLaboratoryPartOfOrgLocalServiceWrapper() {
		this(null);
	}

	public AddLaboratoryPartOfOrgLocalServiceWrapper(
		AddLaboratoryPartOfOrgLocalService addLaboratoryPartOfOrgLocalService) {

		_addLaboratoryPartOfOrgLocalService =
			addLaboratoryPartOfOrgLocalService;
	}

	/**
	 * Adds the add laboratory part of org to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 * @return the add laboratory part of org that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
		addAddLaboratoryPartOfOrg(
			com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
				addLaboratoryPartOfOrg) {

		return _addLaboratoryPartOfOrgLocalService.addAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrg);
	}

	/**
	 * Creates a new add laboratory part of org with the primary key. Does not add the add laboratory part of org to the database.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key for the new add laboratory part of org
	 * @return the new add laboratory part of org
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
		createAddLaboratoryPartOfOrg(long addLaboratoryPartOfOrgId) {

		return _addLaboratoryPartOfOrgLocalService.createAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrgId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLaboratoryPartOfOrgLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add laboratory part of org from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
		deleteAddLaboratoryPartOfOrg(
			com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
				addLaboratoryPartOfOrg) {

		return _addLaboratoryPartOfOrgLocalService.deleteAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrg);
	}

	/**
	 * Deletes the add laboratory part of org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org that was removed
	 * @throws PortalException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
			deleteAddLaboratoryPartOfOrg(long addLaboratoryPartOfOrgId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLaboratoryPartOfOrgLocalService.deleteAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrgId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLaboratoryPartOfOrgLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLaboratoryPartOfOrgLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLaboratoryPartOfOrgLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLaboratoryPartOfOrgLocalService.dynamicQuery();
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

		return _addLaboratoryPartOfOrgLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl</code>.
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

		return _addLaboratoryPartOfOrgLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl</code>.
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

		return _addLaboratoryPartOfOrgLocalService.dynamicQuery(
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

		return _addLaboratoryPartOfOrgLocalService.dynamicQueryCount(
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

		return _addLaboratoryPartOfOrgLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
		fetchAddLaboratoryPartOfOrg(long addLaboratoryPartOfOrgId) {

		return _addLaboratoryPartOfOrgLocalService.fetchAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrgId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLaboratoryPartOfOrgLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add laboratory part of org with the primary key.
	 *
	 * @param addLaboratoryPartOfOrgId the primary key of the add laboratory part of org
	 * @return the add laboratory part of org
	 * @throws PortalException if a add laboratory part of org with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
			getAddLaboratoryPartOfOrg(long addLaboratoryPartOfOrgId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLaboratoryPartOfOrgLocalService.getAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrgId);
	}

	/**
	 * Returns a range of all the add laboratory part of orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLaboratoryPartOfOrgModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add laboratory part of orgs
	 * @param end the upper bound of the range of add laboratory part of orgs (not inclusive)
	 * @return the range of add laboratory part of orgs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg>
			getAddLaboratoryPartOfOrgs(int start, int end) {

		return _addLaboratoryPartOfOrgLocalService.getAddLaboratoryPartOfOrgs(
			start, end);
	}

	/**
	 * Returns the number of add laboratory part of orgs.
	 *
	 * @return the number of add laboratory part of orgs
	 */
	@Override
	public int getAddLaboratoryPartOfOrgsCount() {
		return _addLaboratoryPartOfOrgLocalService.
			getAddLaboratoryPartOfOrgsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLaboratoryPartOfOrgLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg>
			getJanaacByAppId(long janaacApplicationId) {

		return _addLaboratoryPartOfOrgLocalService.getJanaacByAppId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLaboratoryPartOfOrgLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLaboratoryPartOfOrgLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add laboratory part of org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLaboratoryPartOfOrgLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLaboratoryPartOfOrg the add laboratory part of org
	 * @return the add laboratory part of org that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
		updateAddLaboratoryPartOfOrg(
			com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg
				addLaboratoryPartOfOrg) {

		return _addLaboratoryPartOfOrgLocalService.updateAddLaboratoryPartOfOrg(
			addLaboratoryPartOfOrg);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLaboratoryPartOfOrgLocalService.getBasePersistence();
	}

	@Override
	public AddLaboratoryPartOfOrgLocalService getWrappedService() {
		return _addLaboratoryPartOfOrgLocalService;
	}

	@Override
	public void setWrappedService(
		AddLaboratoryPartOfOrgLocalService addLaboratoryPartOfOrgLocalService) {

		_addLaboratoryPartOfOrgLocalService =
			addLaboratoryPartOfOrgLocalService;
	}

	private AddLaboratoryPartOfOrgLocalService
		_addLaboratoryPartOfOrgLocalService;

}