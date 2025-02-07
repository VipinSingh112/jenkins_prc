/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JTBPaymentMethod. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.JTBPaymentMethodLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethodLocalService
 * @generated
 */
public class JTBPaymentMethodLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.JTBPaymentMethodLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb payment method to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 * @return the jtb payment method that was added
	 */
	public static JTBPaymentMethod addJTBPaymentMethod(
		JTBPaymentMethod jtbPaymentMethod) {

		return getService().addJTBPaymentMethod(jtbPaymentMethod);
	}

	/**
	 * Creates a new jtb payment method with the primary key. Does not add the jtb payment method to the database.
	 *
	 * @param jTBPaymentMethodId the primary key for the new jtb payment method
	 * @return the new jtb payment method
	 */
	public static JTBPaymentMethod createJTBPaymentMethod(
		long jTBPaymentMethodId) {

		return getService().createJTBPaymentMethod(jTBPaymentMethodId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jtb payment method from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 * @return the jtb payment method that was removed
	 */
	public static JTBPaymentMethod deleteJTBPaymentMethod(
		JTBPaymentMethod jtbPaymentMethod) {

		return getService().deleteJTBPaymentMethod(jtbPaymentMethod);
	}

	/**
	 * Deletes the jtb payment method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method that was removed
	 * @throws PortalException if a jtb payment method with the primary key could not be found
	 */
	public static JTBPaymentMethod deleteJTBPaymentMethod(
			long jTBPaymentMethodId)
		throws PortalException {

		return getService().deleteJTBPaymentMethod(jTBPaymentMethodId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static JTBPaymentMethod fetchJTBPaymentMethod(
		long jTBPaymentMethodId) {

		return getService().fetchJTBPaymentMethod(jTBPaymentMethodId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static JTBPaymentMethod getJTBById(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBPaymentMethodException {

		return getService().getJTBById(jtbApplicationId);
	}

	/**
	 * Returns the jtb payment method with the primary key.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method
	 * @throws PortalException if a jtb payment method with the primary key could not be found
	 */
	public static JTBPaymentMethod getJTBPaymentMethod(long jTBPaymentMethodId)
		throws PortalException {

		return getService().getJTBPaymentMethod(jTBPaymentMethodId);
	}

	/**
	 * Returns a range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @return the range of jtb payment methods
	 */
	public static List<JTBPaymentMethod> getJTBPaymentMethods(
		int start, int end) {

		return getService().getJTBPaymentMethods(start, end);
	}

	/**
	 * Returns the number of jtb payment methods.
	 *
	 * @return the number of jtb payment methods
	 */
	public static int getJTBPaymentMethodsCount() {
		return getService().getJTBPaymentMethodsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jtb payment method in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBPaymentMethodLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 * @return the jtb payment method that was updated
	 */
	public static JTBPaymentMethod updateJTBPaymentMethod(
		JTBPaymentMethod jtbPaymentMethod) {

		return getService().updateJTBPaymentMethod(jtbPaymentMethod);
	}

	public static JTBPaymentMethodLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JTBPaymentMethodLocalService>
		_serviceSnapshot = new Snapshot<>(
			JTBPaymentMethodLocalServiceUtil.class,
			JTBPaymentMethodLocalService.class);

}