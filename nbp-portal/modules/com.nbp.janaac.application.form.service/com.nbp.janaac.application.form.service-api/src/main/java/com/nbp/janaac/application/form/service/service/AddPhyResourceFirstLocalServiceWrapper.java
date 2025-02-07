/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddPhyResourceFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirstLocalService
 * @generated
 */
public class AddPhyResourceFirstLocalServiceWrapper
	implements AddPhyResourceFirstLocalService,
			   ServiceWrapper<AddPhyResourceFirstLocalService> {

	public AddPhyResourceFirstLocalServiceWrapper() {
		this(null);
	}

	public AddPhyResourceFirstLocalServiceWrapper(
		AddPhyResourceFirstLocalService addPhyResourceFirstLocalService) {

		_addPhyResourceFirstLocalService = addPhyResourceFirstLocalService;
	}

	/**
	 * Adds the add phy resource first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceFirst the add phy resource first
	 * @return the add phy resource first that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
		addAddPhyResourceFirst(
			com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
				addPhyResourceFirst) {

		return _addPhyResourceFirstLocalService.addAddPhyResourceFirst(
			addPhyResourceFirst);
	}

	/**
	 * Creates a new add phy resource first with the primary key. Does not add the add phy resource first to the database.
	 *
	 * @param addPhyResourceFirstId the primary key for the new add phy resource first
	 * @return the new add phy resource first
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
		createAddPhyResourceFirst(long addPhyResourceFirstId) {

		return _addPhyResourceFirstLocalService.createAddPhyResourceFirst(
			addPhyResourceFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add phy resource first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceFirst the add phy resource first
	 * @return the add phy resource first that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
		deleteAddPhyResourceFirst(
			com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
				addPhyResourceFirst) {

		return _addPhyResourceFirstLocalService.deleteAddPhyResourceFirst(
			addPhyResourceFirst);
	}

	/**
	 * Deletes the add phy resource first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first that was removed
	 * @throws PortalException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
			deleteAddPhyResourceFirst(long addPhyResourceFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceFirstLocalService.deleteAddPhyResourceFirst(
			addPhyResourceFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addPhyResourceFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addPhyResourceFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addPhyResourceFirstLocalService.dynamicQuery();
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

		return _addPhyResourceFirstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstModelImpl</code>.
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

		return _addPhyResourceFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstModelImpl</code>.
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

		return _addPhyResourceFirstLocalService.dynamicQuery(
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

		return _addPhyResourceFirstLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addPhyResourceFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
		fetchAddPhyResourceFirst(long addPhyResourceFirstId) {

		return _addPhyResourceFirstLocalService.fetchAddPhyResourceFirst(
			addPhyResourceFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addPhyResourceFirstLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add phy resource first with the primary key.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first
	 * @throws PortalException if a add phy resource first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
			getAddPhyResourceFirst(long addPhyResourceFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceFirstLocalService.getAddPhyResourceFirst(
			addPhyResourceFirstId);
	}

	/**
	 * Returns a range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of add phy resource firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddPhyResourceFirst>
			getAddPhyResourceFirsts(int start, int end) {

		return _addPhyResourceFirstLocalService.getAddPhyResourceFirsts(
			start, end);
	}

	/**
	 * Returns the number of add phy resource firsts.
	 *
	 * @return the number of add phy resource firsts
	 */
	@Override
	public int getAddPhyResourceFirstsCount() {
		return _addPhyResourceFirstLocalService.getAddPhyResourceFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addPhyResourceFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddPhyResourceFirst>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addPhyResourceFirstLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addPhyResourceFirstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add phy resource first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceFirst the add phy resource first
	 * @return the add phy resource first that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
		updateAddPhyResourceFirst(
			com.nbp.janaac.application.form.service.model.AddPhyResourceFirst
				addPhyResourceFirst) {

		return _addPhyResourceFirstLocalService.updateAddPhyResourceFirst(
			addPhyResourceFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addPhyResourceFirstLocalService.getBasePersistence();
	}

	@Override
	public AddPhyResourceFirstLocalService getWrappedService() {
		return _addPhyResourceFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddPhyResourceFirstLocalService addPhyResourceFirstLocalService) {

		_addPhyResourceFirstLocalService = addPhyResourceFirstLocalService;
	}

	private AddPhyResourceFirstLocalService _addPhyResourceFirstLocalService;

}