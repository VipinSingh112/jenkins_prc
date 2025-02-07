/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddInsOrgInfoFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirstLocalService
 * @generated
 */
public class AddInsOrgInfoFirstLocalServiceWrapper
	implements AddInsOrgInfoFirstLocalService,
			   ServiceWrapper<AddInsOrgInfoFirstLocalService> {

	public AddInsOrgInfoFirstLocalServiceWrapper() {
		this(null);
	}

	public AddInsOrgInfoFirstLocalServiceWrapper(
		AddInsOrgInfoFirstLocalService addInsOrgInfoFirstLocalService) {

		_addInsOrgInfoFirstLocalService = addInsOrgInfoFirstLocalService;
	}

	/**
	 * Adds the add ins org info first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoFirst the add ins org info first
	 * @return the add ins org info first that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
		addAddInsOrgInfoFirst(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
				addInsOrgInfoFirst) {

		return _addInsOrgInfoFirstLocalService.addAddInsOrgInfoFirst(
			addInsOrgInfoFirst);
	}

	/**
	 * Creates a new add ins org info first with the primary key. Does not add the add ins org info first to the database.
	 *
	 * @param addInsOrgInfoFirstId the primary key for the new add ins org info first
	 * @return the new add ins org info first
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
		createAddInsOrgInfoFirst(long addInsOrgInfoFirstId) {

		return _addInsOrgInfoFirstLocalService.createAddInsOrgInfoFirst(
			addInsOrgInfoFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add ins org info first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoFirst the add ins org info first
	 * @return the add ins org info first that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
		deleteAddInsOrgInfoFirst(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
				addInsOrgInfoFirst) {

		return _addInsOrgInfoFirstLocalService.deleteAddInsOrgInfoFirst(
			addInsOrgInfoFirst);
	}

	/**
	 * Deletes the add ins org info first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first that was removed
	 * @throws PortalException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
			deleteAddInsOrgInfoFirst(long addInsOrgInfoFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoFirstLocalService.deleteAddInsOrgInfoFirst(
			addInsOrgInfoFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addInsOrgInfoFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addInsOrgInfoFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addInsOrgInfoFirstLocalService.dynamicQuery();
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

		return _addInsOrgInfoFirstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstModelImpl</code>.
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

		return _addInsOrgInfoFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstModelImpl</code>.
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

		return _addInsOrgInfoFirstLocalService.dynamicQuery(
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

		return _addInsOrgInfoFirstLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addInsOrgInfoFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
		fetchAddInsOrgInfoFirst(long addInsOrgInfoFirstId) {

		return _addInsOrgInfoFirstLocalService.fetchAddInsOrgInfoFirst(
			addInsOrgInfoFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addInsOrgInfoFirstLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add ins org info first with the primary key.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first
	 * @throws PortalException if a add ins org info first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
			getAddInsOrgInfoFirst(long addInsOrgInfoFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoFirstLocalService.getAddInsOrgInfoFirst(
			addInsOrgInfoFirstId);
	}

	/**
	 * Returns a range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of add ins org info firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst>
			getAddInsOrgInfoFirsts(int start, int end) {

		return _addInsOrgInfoFirstLocalService.getAddInsOrgInfoFirsts(
			start, end);
	}

	/**
	 * Returns the number of add ins org info firsts.
	 *
	 * @return the number of add ins org info firsts
	 */
	@Override
	public int getAddInsOrgInfoFirstsCount() {
		return _addInsOrgInfoFirstLocalService.getAddInsOrgInfoFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addInsOrgInfoFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addInsOrgInfoFirstLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsOrgInfoFirstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsOrgInfoFirstLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add ins org info first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsOrgInfoFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsOrgInfoFirst the add ins org info first
	 * @return the add ins org info first that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
		updateAddInsOrgInfoFirst(
			com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst
				addInsOrgInfoFirst) {

		return _addInsOrgInfoFirstLocalService.updateAddInsOrgInfoFirst(
			addInsOrgInfoFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addInsOrgInfoFirstLocalService.getBasePersistence();
	}

	@Override
	public AddInsOrgInfoFirstLocalService getWrappedService() {
		return _addInsOrgInfoFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddInsOrgInfoFirstLocalService addInsOrgInfoFirstLocalService) {

		_addInsOrgInfoFirstLocalService = addInsOrgInfoFirstLocalService;
	}

	private AddInsOrgInfoFirstLocalService _addInsOrgInfoFirstLocalService;

}