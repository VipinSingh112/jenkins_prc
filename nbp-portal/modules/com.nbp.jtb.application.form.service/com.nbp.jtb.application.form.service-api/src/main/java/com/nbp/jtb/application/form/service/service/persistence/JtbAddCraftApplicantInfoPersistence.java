/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddCraftApplicantInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb add craft applicant info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfoUtil
 * @generated
 */
@ProviderType
public interface JtbAddCraftApplicantInfoPersistence
	extends BasePersistence<JtbAddCraftApplicantInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbAddCraftApplicantInfoUtil} to access the jtb add craft applicant info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @return the range of matching jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a matching jtb add craft applicant info could not be found
	 */
	public JtbAddCraftApplicantInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddCraftApplicantInfo> orderByComparator)
		throws NoSuchJtbAddCraftApplicantInfoException;

	/**
	 * Returns the first jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft applicant info, or <code>null</code> if a matching jtb add craft applicant info could not be found
	 */
	public JtbAddCraftApplicantInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftApplicantInfo> orderByComparator);

	/**
	 * Returns the last jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a matching jtb add craft applicant info could not be found
	 */
	public JtbAddCraftApplicantInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddCraftApplicantInfo> orderByComparator)
		throws NoSuchJtbAddCraftApplicantInfoException;

	/**
	 * Returns the last jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft applicant info, or <code>null</code> if a matching jtb add craft applicant info could not be found
	 */
	public JtbAddCraftApplicantInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftApplicantInfo> orderByComparator);

	/**
	 * Returns the jtb add craft applicant infos before and after the current jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the current jtb add craft applicant info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a jtb add craft applicant info with the primary key could not be found
	 */
	public JtbAddCraftApplicantInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddCraftApplicantInfoId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddCraftApplicantInfo> orderByComparator)
		throws NoSuchJtbAddCraftApplicantInfoException;

	/**
	 * Removes all the jtb add craft applicant infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Returns the number of jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add craft applicant infos
	 */
	public int countBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Caches the jtb add craft applicant info in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftApplicantInfo the jtb add craft applicant info
	 */
	public void cacheResult(JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo);

	/**
	 * Caches the jtb add craft applicant infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftApplicantInfos the jtb add craft applicant infos
	 */
	public void cacheResult(
		java.util.List<JtbAddCraftApplicantInfo> jtbAddCraftApplicantInfos);

	/**
	 * Creates a new jtb add craft applicant info with the primary key. Does not add the jtb add craft applicant info to the database.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key for the new jtb add craft applicant info
	 * @return the new jtb add craft applicant info
	 */
	public JtbAddCraftApplicantInfo create(long jtbAddCraftApplicantInfoId);

	/**
	 * Removes the jtb add craft applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info that was removed
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a jtb add craft applicant info with the primary key could not be found
	 */
	public JtbAddCraftApplicantInfo remove(long jtbAddCraftApplicantInfoId)
		throws NoSuchJtbAddCraftApplicantInfoException;

	public JtbAddCraftApplicantInfo updateImpl(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo);

	/**
	 * Returns the jtb add craft applicant info with the primary key or throws a <code>NoSuchJtbAddCraftApplicantInfoException</code> if it could not be found.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a jtb add craft applicant info with the primary key could not be found
	 */
	public JtbAddCraftApplicantInfo findByPrimaryKey(
			long jtbAddCraftApplicantInfoId)
		throws NoSuchJtbAddCraftApplicantInfoException;

	/**
	 * Returns the jtb add craft applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info, or <code>null</code> if a jtb add craft applicant info with the primary key could not be found
	 */
	public JtbAddCraftApplicantInfo fetchByPrimaryKey(
		long jtbAddCraftApplicantInfoId);

	/**
	 * Returns all the jtb add craft applicant infos.
	 *
	 * @return the jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findAll();

	/**
	 * Returns a range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @return the range of jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftApplicantInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add craft applicant infos
	 */
	public java.util.List<JtbAddCraftApplicantInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JtbAddCraftApplicantInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb add craft applicant infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb add craft applicant infos.
	 *
	 * @return the number of jtb add craft applicant infos
	 */
	public int countAll();

}