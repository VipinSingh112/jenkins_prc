/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OfficialUseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUseLocalService
 * @generated
 */
public class OfficialUseLocalServiceWrapper
	implements OfficialUseLocalService,
			   ServiceWrapper<OfficialUseLocalService> {

	public OfficialUseLocalServiceWrapper() {
		this(null);
	}

	public OfficialUseLocalServiceWrapper(
		OfficialUseLocalService officialUseLocalService) {

		_officialUseLocalService = officialUseLocalService;
	}

	/**
	 * Adds the official use to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfficialUseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param officialUse the official use
	 * @return the official use that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
		addOfficialUse(
			com.nbp.osi.application.form.services.model.OfficialUse
				officialUse) {

		return _officialUseLocalService.addOfficialUse(officialUse);
	}

	/**
	 * Creates a new official use with the primary key. Does not add the official use to the database.
	 *
	 * @param officialUseId the primary key for the new official use
	 * @return the new official use
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
		createOfficialUse(long officialUseId) {

		return _officialUseLocalService.createOfficialUse(officialUseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officialUseLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the official use with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfficialUseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use that was removed
	 * @throws PortalException if a official use with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
			deleteOfficialUse(long officialUseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officialUseLocalService.deleteOfficialUse(officialUseId);
	}

	/**
	 * Deletes the official use from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfficialUseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param officialUse the official use
	 * @return the official use that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
		deleteOfficialUse(
			com.nbp.osi.application.form.services.model.OfficialUse
				officialUse) {

		return _officialUseLocalService.deleteOfficialUse(officialUse);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officialUseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _officialUseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _officialUseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _officialUseLocalService.dynamicQuery();
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

		return _officialUseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OfficialUseModelImpl</code>.
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

		return _officialUseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OfficialUseModelImpl</code>.
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

		return _officialUseLocalService.dynamicQuery(
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

		return _officialUseLocalService.dynamicQueryCount(dynamicQuery);
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

		return _officialUseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
		fetchOfficialUse(long officialUseId) {

		return _officialUseLocalService.fetchOfficialUse(officialUseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _officialUseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _officialUseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the official use with the primary key.
	 *
	 * @param officialUseId the primary key of the official use
	 * @return the official use
	 * @throws PortalException if a official use with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
			getOfficialUse(long officialUseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officialUseLocalService.getOfficialUse(officialUseId);
	}

	/**
	 * Returns a range of all the official uses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OfficialUseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of official uses
	 * @param end the upper bound of the range of official uses (not inclusive)
	 * @return the range of official uses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OfficialUse>
			getOfficialUses(int start, int end) {

		return _officialUseLocalService.getOfficialUses(start, end);
	}

	/**
	 * Returns the number of official uses.
	 *
	 * @return the number of official uses
	 */
	@Override
	public int getOfficialUsesCount() {
		return _officialUseLocalService.getOfficialUsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _officialUseLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse getOsiById(
			long applicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOfficialUseException {

		return _officialUseLocalService.getOsiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _officialUseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the official use in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OfficialUseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param officialUse the official use
	 * @return the official use that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OfficialUse
		updateOfficialUse(
			com.nbp.osi.application.form.services.model.OfficialUse
				officialUse) {

		return _officialUseLocalService.updateOfficialUse(officialUse);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _officialUseLocalService.getBasePersistence();
	}

	@Override
	public OfficialUseLocalService getWrappedService() {
		return _officialUseLocalService;
	}

	@Override
	public void setWrappedService(
		OfficialUseLocalService officialUseLocalService) {

		_officialUseLocalService = officialUseLocalService;
	}

	private OfficialUseLocalService _officialUseLocalService;

}