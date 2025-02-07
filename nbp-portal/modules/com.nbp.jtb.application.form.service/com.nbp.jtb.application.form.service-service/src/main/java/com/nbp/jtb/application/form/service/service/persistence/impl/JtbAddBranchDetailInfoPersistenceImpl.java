/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbAddBranchDetailInfoException;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfoTable;
import com.nbp.jtb.application.form.service.model.impl.JtbAddBranchDetailInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.JtbAddBranchDetailInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddBranchDetailInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddBranchDetailInfoUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the jtb add branch detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JtbAddBranchDetailInfoPersistence.class)
public class JtbAddBranchDetailInfoPersistenceImpl
	extends BasePersistenceImpl<JtbAddBranchDetailInfo>
	implements JtbAddBranchDetailInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbAddBranchDetailInfoUtil</code> to access the jtb add branch detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbAddBranchDetailInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or throws a <code>NoSuchJtbAddBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbAddBranchDetailInfoException {

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (jtbAddBranchDetailInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbAddBranchDetailInfoException(sb.toString());
		}

		return jtbAddBranchDetailInfo;
	}

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the jtb add branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof JtbAddBranchDetailInfo) {
			JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
				(JtbAddBranchDetailInfo)result;

			if (jtbApplicationId !=
					jtbAddBranchDetailInfo.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBADDBRANCHDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<JtbAddBranchDetailInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"JtbAddBranchDetailInfoPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbAddBranchDetailInfo jtbAddBranchDetailInfo = list.get(0);

					result = jtbAddBranchDetailInfo;

					cacheResult(jtbAddBranchDetailInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (JtbAddBranchDetailInfo)result;
		}
	}

	/**
	 * Removes the jtb add branch detail info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb add branch detail info that was removed
	 */
	@Override
	public JtbAddBranchDetailInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbAddBranchDetailInfoException {

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(jtbAddBranchDetailInfo);
	}

	/**
	 * Returns the number of jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add branch detail infos
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBADDBRANCHDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"jtbAddBranchDetailInfo.jtbApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetByJtbAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetByJtbAppId;
	private FinderPath _finderPathCountBygetByJtbAppId;

	/**
	 * Returns all the jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add branch detail infos
	 */
	@Override
	public List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId) {

		return findBygetByJtbAppId(
			jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return findBygetByJtbAppId(jtbApplicationId, start, end, null);
	}

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
	@Override
	public List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<JtbAddBranchDetailInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetByJtbAppId;
				finderArgs = new Object[] {jtbApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetByJtbAppId;
			finderArgs = new Object[] {
				jtbApplicationId, start, end, orderByComparator
			};
		}

		List<JtbAddBranchDetailInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbAddBranchDetailInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbAddBranchDetailInfo jtbAddBranchDetailInfo : list) {
					if (jtbApplicationId !=
							jtbAddBranchDetailInfo.getJtbApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_JTBADDBRANCHDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbAddBranchDetailInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				list = (List<JtbAddBranchDetailInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddBranchDetailInfo> orderByComparator)
		throws NoSuchJtbAddBranchDetailInfoException {

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
			fetchBygetByJtbAppId_First(jtbApplicationId, orderByComparator);

		if (jtbAddBranchDetailInfo != null) {
			return jtbAddBranchDetailInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddBranchDetailInfoException(sb.toString());
	}

	/**
	 * Returns the first jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		List<JtbAddBranchDetailInfo> list = findBygetByJtbAppId(
			jtbApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddBranchDetailInfo> orderByComparator)
		throws NoSuchJtbAddBranchDetailInfoException {

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
			fetchBygetByJtbAppId_Last(jtbApplicationId, orderByComparator);

		if (jtbAddBranchDetailInfo != null) {
			return jtbAddBranchDetailInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("jtbApplicationId=");
		sb.append(jtbApplicationId);

		sb.append("}");

		throw new NoSuchJtbAddBranchDetailInfoException(sb.toString());
	}

	/**
	 * Returns the last jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add branch detail info, or <code>null</code> if a matching jtb add branch detail info could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		int count = countBygetByJtbAppId(jtbApplicationId);

		if (count == 0) {
			return null;
		}

		List<JtbAddBranchDetailInfo> list = findBygetByJtbAppId(
			jtbApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb add branch detail infos before and after the current jtb add branch detail info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the current jtb add branch detail info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbBranchDetailInfoId, long jtbApplicationId,
			OrderByComparator<JtbAddBranchDetailInfo> orderByComparator)
		throws NoSuchJtbAddBranchDetailInfoException {

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo = findByPrimaryKey(
			jtbBranchDetailInfoId);

		Session session = null;

		try {
			session = openSession();

			JtbAddBranchDetailInfo[] array = new JtbAddBranchDetailInfoImpl[3];

			array[0] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddBranchDetailInfo, jtbApplicationId,
				orderByComparator, true);

			array[1] = jtbAddBranchDetailInfo;

			array[2] = getBygetByJtbAppId_PrevAndNext(
				session, jtbAddBranchDetailInfo, jtbApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JtbAddBranchDetailInfo getBygetByJtbAppId_PrevAndNext(
		Session session, JtbAddBranchDetailInfo jtbAddBranchDetailInfo,
		long jtbApplicationId,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JTBADDBRANCHDETAILINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(JtbAddBranchDetailInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(jtbApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jtbAddBranchDetailInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbAddBranchDetailInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb add branch detail infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	@Override
	public void removeBygetByJtbAppId(long jtbApplicationId) {
		for (JtbAddBranchDetailInfo jtbAddBranchDetailInfo :
				findBygetByJtbAppId(
					jtbApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbAddBranchDetailInfo);
		}
	}

	/**
	 * Returns the number of jtb add branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add branch detail infos
	 */
	@Override
	public int countBygetByJtbAppId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByJtbAppId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBADDBRANCHDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETBYJTBAPPID_JTBAPPLICATIONID_2 =
			"jtbAddBranchDetailInfo.jtbApplicationId = ?";

	public JtbAddBranchDetailInfoPersistenceImpl() {
		setModelClass(JtbAddBranchDetailInfo.class);

		setModelImplClass(JtbAddBranchDetailInfoImpl.class);
		setModelPKClass(long.class);

		setTable(JtbAddBranchDetailInfoTable.INSTANCE);
	}

	/**
	 * Caches the jtb add branch detail info in the entity cache if it is enabled.
	 *
	 * @param jtbAddBranchDetailInfo the jtb add branch detail info
	 */
	@Override
	public void cacheResult(JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {
		entityCache.putResult(
			JtbAddBranchDetailInfoImpl.class,
			jtbAddBranchDetailInfo.getPrimaryKey(), jtbAddBranchDetailInfo);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {jtbAddBranchDetailInfo.getJtbApplicationId()},
			jtbAddBranchDetailInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb add branch detail infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddBranchDetailInfos the jtb add branch detail infos
	 */
	@Override
	public void cacheResult(
		List<JtbAddBranchDetailInfo> jtbAddBranchDetailInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbAddBranchDetailInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbAddBranchDetailInfo jtbAddBranchDetailInfo :
				jtbAddBranchDetailInfos) {

			if (entityCache.getResult(
					JtbAddBranchDetailInfoImpl.class,
					jtbAddBranchDetailInfo.getPrimaryKey()) == null) {

				cacheResult(jtbAddBranchDetailInfo);
			}
		}
	}

	/**
	 * Clears the cache for all jtb add branch detail infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbAddBranchDetailInfoImpl.class);

		finderCache.clearCache(JtbAddBranchDetailInfoImpl.class);
	}

	/**
	 * Clears the cache for the jtb add branch detail info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {
		entityCache.removeResult(
			JtbAddBranchDetailInfoImpl.class, jtbAddBranchDetailInfo);
	}

	@Override
	public void clearCache(
		List<JtbAddBranchDetailInfo> jtbAddBranchDetailInfos) {

		for (JtbAddBranchDetailInfo jtbAddBranchDetailInfo :
				jtbAddBranchDetailInfos) {

			entityCache.removeResult(
				JtbAddBranchDetailInfoImpl.class, jtbAddBranchDetailInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbAddBranchDetailInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbAddBranchDetailInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JtbAddBranchDetailInfoModelImpl jtbAddBranchDetailInfoModelImpl) {

		Object[] args = new Object[] {
			jtbAddBranchDetailInfoModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			jtbAddBranchDetailInfoModelImpl);
	}

	/**
	 * Creates a new jtb add branch detail info with the primary key. Does not add the jtb add branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb add branch detail info
	 * @return the new jtb add branch detail info
	 */
	@Override
	public JtbAddBranchDetailInfo create(long jtbBranchDetailInfoId) {
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
			new JtbAddBranchDetailInfoImpl();

		jtbAddBranchDetailInfo.setNew(true);
		jtbAddBranchDetailInfo.setPrimaryKey(jtbBranchDetailInfoId);

		jtbAddBranchDetailInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbAddBranchDetailInfo;
	}

	/**
	 * Removes the jtb add branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info that was removed
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo remove(long jtbBranchDetailInfoId)
		throws NoSuchJtbAddBranchDetailInfoException {

		return remove((Serializable)jtbBranchDetailInfoId);
	}

	/**
	 * Removes the jtb add branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info that was removed
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo remove(Serializable primaryKey)
		throws NoSuchJtbAddBranchDetailInfoException {

		Session session = null;

		try {
			session = openSession();

			JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
				(JtbAddBranchDetailInfo)session.get(
					JtbAddBranchDetailInfoImpl.class, primaryKey);

			if (jtbAddBranchDetailInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbAddBranchDetailInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbAddBranchDetailInfo);
		}
		catch (NoSuchJtbAddBranchDetailInfoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected JtbAddBranchDetailInfo removeImpl(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbAddBranchDetailInfo)) {
				jtbAddBranchDetailInfo = (JtbAddBranchDetailInfo)session.get(
					JtbAddBranchDetailInfoImpl.class,
					jtbAddBranchDetailInfo.getPrimaryKeyObj());
			}

			if (jtbAddBranchDetailInfo != null) {
				session.delete(jtbAddBranchDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbAddBranchDetailInfo != null) {
			clearCache(jtbAddBranchDetailInfo);
		}

		return jtbAddBranchDetailInfo;
	}

	@Override
	public JtbAddBranchDetailInfo updateImpl(
		JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {

		boolean isNew = jtbAddBranchDetailInfo.isNew();

		if (!(jtbAddBranchDetailInfo instanceof
				JtbAddBranchDetailInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbAddBranchDetailInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbAddBranchDetailInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbAddBranchDetailInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbAddBranchDetailInfo implementation " +
					jtbAddBranchDetailInfo.getClass());
		}

		JtbAddBranchDetailInfoModelImpl jtbAddBranchDetailInfoModelImpl =
			(JtbAddBranchDetailInfoModelImpl)jtbAddBranchDetailInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbAddBranchDetailInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbAddBranchDetailInfo.setCreateDate(date);
			}
			else {
				jtbAddBranchDetailInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbAddBranchDetailInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbAddBranchDetailInfo.setModifiedDate(date);
			}
			else {
				jtbAddBranchDetailInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbAddBranchDetailInfo);
			}
			else {
				jtbAddBranchDetailInfo = (JtbAddBranchDetailInfo)session.merge(
					jtbAddBranchDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbAddBranchDetailInfoImpl.class, jtbAddBranchDetailInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(jtbAddBranchDetailInfoModelImpl);

		if (isNew) {
			jtbAddBranchDetailInfo.setNew(false);
		}

		jtbAddBranchDetailInfo.resetOriginalValues();

		return jtbAddBranchDetailInfo;
	}

	/**
	 * Returns the jtb add branch detail info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbAddBranchDetailInfoException {

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo = fetchByPrimaryKey(
			primaryKey);

		if (jtbAddBranchDetailInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbAddBranchDetailInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbAddBranchDetailInfo;
	}

	/**
	 * Returns the jtb add branch detail info with the primary key or throws a <code>NoSuchJtbAddBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info
	 * @throws NoSuchJtbAddBranchDetailInfoException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo findByPrimaryKey(long jtbBranchDetailInfoId)
		throws NoSuchJtbAddBranchDetailInfoException {

		return findByPrimaryKey((Serializable)jtbBranchDetailInfoId);
	}

	/**
	 * Returns the jtb add branch detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info, or <code>null</code> if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public JtbAddBranchDetailInfo fetchByPrimaryKey(
		long jtbBranchDetailInfoId) {

		return fetchByPrimaryKey((Serializable)jtbBranchDetailInfoId);
	}

	/**
	 * Returns all the jtb add branch detail infos.
	 *
	 * @return the jtb add branch detail infos
	 */
	@Override
	public List<JtbAddBranchDetailInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<JtbAddBranchDetailInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<JtbAddBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<JtbAddBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddBranchDetailInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<JtbAddBranchDetailInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbAddBranchDetailInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBADDBRANCHDETAILINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBADDBRANCHDETAILINFO;

				sql = sql.concat(JtbAddBranchDetailInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbAddBranchDetailInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the jtb add branch detail infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbAddBranchDetailInfo jtbAddBranchDetailInfo : findAll()) {
			remove(jtbAddBranchDetailInfo);
		}
	}

	/**
	 * Returns the number of jtb add branch detail infos.
	 *
	 * @return the number of jtb add branch detail infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_JTBADDBRANCHDETAILINFO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "jtbBranchDetailInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBADDBRANCHDETAILINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbAddBranchDetailInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb add branch detail info persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		_finderPathWithPaginationFindBygetByJtbAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetByJtbAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"jtbApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetByJtbAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetByJtbAppId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetByJtbAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetByJtbAppId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		JtbAddBranchDetailInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JtbAddBranchDetailInfoUtil.setPersistence(null);

		entityCache.removeCache(JtbAddBranchDetailInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBADDBRANCHDETAILINFO =
		"SELECT jtbAddBranchDetailInfo FROM JtbAddBranchDetailInfo jtbAddBranchDetailInfo";

	private static final String _SQL_SELECT_JTBADDBRANCHDETAILINFO_WHERE =
		"SELECT jtbAddBranchDetailInfo FROM JtbAddBranchDetailInfo jtbAddBranchDetailInfo WHERE ";

	private static final String _SQL_COUNT_JTBADDBRANCHDETAILINFO =
		"SELECT COUNT(jtbAddBranchDetailInfo) FROM JtbAddBranchDetailInfo jtbAddBranchDetailInfo";

	private static final String _SQL_COUNT_JTBADDBRANCHDETAILINFO_WHERE =
		"SELECT COUNT(jtbAddBranchDetailInfo) FROM JtbAddBranchDetailInfo jtbAddBranchDetailInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbAddBranchDetailInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbAddBranchDetailInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbAddBranchDetailInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbAddBranchDetailInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}