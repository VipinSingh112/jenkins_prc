/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddBranchDetailInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb add branch detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddBranchDetailInfoUtil
 * @generated
 */
@ProviderType
public interface JtbAddBranchDetailInfoPersistence
	extends BasePersistence<JtbAddBranchDetailInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbAddBranchDetailInfoUtil} to access the jtb add branch detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or throws a <code>NoSuchJtbAddBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbAddBranchDetailInfoException;

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the jtb add branch detail info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb add branch detail info that was removed
	 */
	public JtbAddBranchDetailInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbAddBranchDetailInfoException;

	/**
	 * Returns the number of jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add branch detail infos
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Returns all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @return the range of matching jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddBranchDetailInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddBranchDetailInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddBranchDetailInfo> orderByComparator)
		throws NoSuchJtbAddBranchDetailInfoException;

	/**
	 * Returns the first jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddBranchDetailInfo>
			orderByComparator);

	/**
	 * Returns the last jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddBranchDetailInfo> orderByComparator)
		throws NoSuchJtbAddBranchDetailInfoException;

	/**
	 * Returns the last jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	public JtbAddBranchDetailInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddBranchDetailInfo>
			orderByComparator);

	/**
	 * Returns the jtb add branch detail infos before and after the current jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the current jtb add branch detail info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	public JtbAddBranchDetailInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbBranchDetailInfoId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAddBranchDetailInfo> orderByComparator)
		throws NoSuchJtbAddBranchDetailInfoException;

	/**
	 * Removes all the jtb add branch detail infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Returns the number of jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add branch detail infos
	 */
	public int countBygetByJtbAppId(long jtbApplicationId);

	/**
	 * Caches the jtb add branch detail info in the entity cache if it is enabled.
	 *
	 * @param jtbAddBranchDetailInfo the jtb add branch detail info
	 */
	public void cacheResult(JtbAddBranchDetailInfo jtbAddBranchDetailInfo);

	/**
	 * Caches the jtb add branch detail infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddBranchDetailInfos the jtb add branch detail infos
	 */
	public void cacheResult(
		java.util.List<JtbAddBranchDetailInfo> jtbAddBranchDetailInfos);

	/**
	 * Creates a new jtb add branch detail info with the primary key. Does not add the jtb add branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb add branch detail info
	 * @return the new jtb add branch detail info
	 */
	public JtbAddBranchDetailInfo create(long jtbBranchDetailInfoId);

	/**
	 * Removes the jtb add branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info that was removed
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	public JtbAddBranchDetailInfo remove(long jtbBranchDetailInfoId)
		throws NoSuchJtbAddBranchDetailInfoException;

	public JtbAddBranchDetailInfo updateImpl(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo);

	/**
	 * Returns the jtb add branch detail info with the primary key or throws a <code>NoSuchJtbAddBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	public JtbAddBranchDetailInfo findByPrimaryKey(long jtbBranchDetailInfoId)
		throws NoSuchJtbAddBranchDetailInfoException;

	/**
	 * Returns the jtb add branch detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info, or <code>null</code> if a jtb add branch detail info with the primary key could not be found
	 */
	public JtbAddBranchDetailInfo fetchByPrimaryKey(long jtbBranchDetailInfoId);

	/**
	 * Returns all the jtb add branch detail infos.
	 *
	 * @return the jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findAll();

	/**
	 * Returns a range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @return the range of jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddBranchDetailInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add branch detail infos
	 */
	public java.util.List<JtbAddBranchDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAddBranchDetailInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb add branch detail infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb add branch detail infos.
	 *
	 * @return the number of jtb add branch detail infos
	 */
	public int countAll();

}