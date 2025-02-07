/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabMedicalOrganFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganFirstLocalService
 * @generated
 */
public class AddLabMedicalOrganFirstLocalServiceWrapper
	implements AddLabMedicalOrganFirstLocalService,
			   ServiceWrapper<AddLabMedicalOrganFirstLocalService> {

	public AddLabMedicalOrganFirstLocalServiceWrapper() {
		this(null);
	}

	public AddLabMedicalOrganFirstLocalServiceWrapper(
		AddLabMedicalOrganFirstLocalService
			addLabMedicalOrganFirstLocalService) {

		_addLabMedicalOrganFirstLocalService =
			addLabMedicalOrganFirstLocalService;
	}

	/**
	 * Adds the add lab medical organ first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 * @return the add lab medical organ first that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
		addAddLabMedicalOrganFirst(
			com.nbp.janaac.application.form.service.model.
				AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return _addLabMedicalOrganFirstLocalService.addAddLabMedicalOrganFirst(
			addLabMedicalOrganFirst);
	}

	/**
	 * Creates a new add lab medical organ first with the primary key. Does not add the add lab medical organ first to the database.
	 *
	 * @param addLabMedicalOrganFirstId the primary key for the new add lab medical organ first
	 * @return the new add lab medical organ first
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
		createAddLabMedicalOrganFirst(long addLabMedicalOrganFirstId) {

		return _addLabMedicalOrganFirstLocalService.
			createAddLabMedicalOrganFirst(addLabMedicalOrganFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab medical organ first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
		deleteAddLabMedicalOrganFirst(
			com.nbp.janaac.application.form.service.model.
				AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return _addLabMedicalOrganFirstLocalService.
			deleteAddLabMedicalOrganFirst(addLabMedicalOrganFirst);
	}

	/**
	 * Deletes the add lab medical organ first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 * @throws PortalException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
			deleteAddLabMedicalOrganFirst(long addLabMedicalOrganFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganFirstLocalService.
			deleteAddLabMedicalOrganFirst(addLabMedicalOrganFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabMedicalOrganFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabMedicalOrganFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabMedicalOrganFirstLocalService.dynamicQuery();
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

		return _addLabMedicalOrganFirstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl</code>.
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

		return _addLabMedicalOrganFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl</code>.
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

		return _addLabMedicalOrganFirstLocalService.dynamicQuery(
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

		return _addLabMedicalOrganFirstLocalService.dynamicQueryCount(
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

		return _addLabMedicalOrganFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
		fetchAddLabMedicalOrganFirst(long addLabMedicalOrganFirstId) {

		return _addLabMedicalOrganFirstLocalService.
			fetchAddLabMedicalOrganFirst(addLabMedicalOrganFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabMedicalOrganFirstLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical organ first with the primary key.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first
	 * @throws PortalException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
			getAddLabMedicalOrganFirst(long addLabMedicalOrganFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganFirstLocalService.getAddLabMedicalOrganFirst(
			addLabMedicalOrganFirstId);
	}

	/**
	 * Returns a range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @return the range of add lab medical organ firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst>
			getAddLabMedicalOrganFirsts(int start, int end) {

		return _addLabMedicalOrganFirstLocalService.getAddLabMedicalOrganFirsts(
			start, end);
	}

	/**
	 * Returns the number of add lab medical organ firsts.
	 *
	 * @return the number of add lab medical organ firsts
	 */
	@Override
	public int getAddLabMedicalOrganFirstsCount() {
		return _addLabMedicalOrganFirstLocalService.
			getAddLabMedicalOrganFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabMedicalOrganFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst>
			getJanaacById(long janaacApplicationId) {

		return _addLabMedicalOrganFirstLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalOrganFirstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalOrganFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab medical organ first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalOrganFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 * @return the add lab medical organ first that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst
		updateAddLabMedicalOrganFirst(
			com.nbp.janaac.application.form.service.model.
				AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		return _addLabMedicalOrganFirstLocalService.
			updateAddLabMedicalOrganFirst(addLabMedicalOrganFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabMedicalOrganFirstLocalService.getBasePersistence();
	}

	@Override
	public AddLabMedicalOrganFirstLocalService getWrappedService() {
		return _addLabMedicalOrganFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalOrganFirstLocalService
			addLabMedicalOrganFirstLocalService) {

		_addLabMedicalOrganFirstLocalService =
			addLabMedicalOrganFirstLocalService;
	}

	private AddLabMedicalOrganFirstLocalService
		_addLabMedicalOrganFirstLocalService;

}