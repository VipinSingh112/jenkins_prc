/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCNoticeOfAppearanceException;
import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;
import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearanceTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCNoticeOfAppearanceModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCNoticeOfAppearancePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCNoticeOfAppearanceUtil;
import com.nbp.jadsc.application.form.service.service.persistence.impl.constants.JADSC_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the jadsc notice of appearance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCNoticeOfAppearancePersistence.class)
public class JADSCNoticeOfAppearancePersistenceImpl
	extends BasePersistenceImpl<JADSCNoticeOfAppearance>
	implements JADSCNoticeOfAppearancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCNoticeOfAppearanceUtil</code> to access the jadsc notice of appearance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCNoticeOfAppearanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<JADSCNoticeOfAppearance> list = null;

		if (useFinderCache) {
			list = (List<JADSCNoticeOfAppearance>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCNoticeOfAppearance jadscNoticeOfAppearance : list) {
					if (!uuid.equals(jadscNoticeOfAppearance.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCNoticeOfAppearanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<JADSCNoticeOfAppearance>)QueryUtil.list(
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
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByUuid_First(
			String uuid,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscNoticeOfAppearance != null) {
			return jadscNoticeOfAppearance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCNoticeOfAppearanceException(sb.toString());
	}

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		List<JADSCNoticeOfAppearance> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscNoticeOfAppearance != null) {
			return jadscNoticeOfAppearance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCNoticeOfAppearanceException(sb.toString());
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCNoticeOfAppearance> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc notice of appearances before and after the current jadsc notice of appearance in the ordered set where uuid = &#63;.
	 *
	 * @param jadscNOAId the primary key of the current jadsc notice of appearance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance[] findByUuid_PrevAndNext(
			long jadscNOAId, String uuid,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException {

		uuid = Objects.toString(uuid, "");

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = findByPrimaryKey(
			jadscNOAId);

		Session session = null;

		try {
			session = openSession();

			JADSCNoticeOfAppearance[] array =
				new JADSCNoticeOfAppearanceImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscNoticeOfAppearance, uuid, orderByComparator,
				true);

			array[1] = jadscNoticeOfAppearance;

			array[2] = getByUuid_PrevAndNext(
				session, jadscNoticeOfAppearance, uuid, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCNoticeOfAppearance getByUuid_PrevAndNext(
		Session session, JADSCNoticeOfAppearance jadscNoticeOfAppearance,
		String uuid,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

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
			sb.append(JADSCNoticeOfAppearanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscNoticeOfAppearance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCNoticeOfAppearance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc notice of appearances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCNoticeOfAppearance jadscNoticeOfAppearance :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscNoticeOfAppearance);
		}
	}

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc notice of appearances
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCNOTICEOFAPPEARANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"jadscNoticeOfAppearance.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscNoticeOfAppearance.uuid IS NULL OR jadscNoticeOfAppearance.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchByUUID_G(
			uuid, groupId);

		if (jadscNoticeOfAppearance == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCNoticeOfAppearanceException(sb.toString());
		}

		return jadscNoticeOfAppearance;
	}

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc notice of appearance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof JADSCNoticeOfAppearance) {
			JADSCNoticeOfAppearance jadscNoticeOfAppearance =
				(JADSCNoticeOfAppearance)result;

			if (!Objects.equals(uuid, jadscNoticeOfAppearance.getUuid()) ||
				(groupId != jadscNoticeOfAppearance.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<JADSCNoticeOfAppearance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCNoticeOfAppearance jadscNoticeOfAppearance = list.get(
						0);

					result = jadscNoticeOfAppearance;

					cacheResult(jadscNoticeOfAppearance);
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
			return (JADSCNoticeOfAppearance)result;
		}
	}

	/**
	 * Removes the jadsc notice of appearance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc notice of appearance that was removed
	 */
	@Override
	public JADSCNoticeOfAppearance removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = findByUUID_G(
			uuid, groupId);

		return remove(jadscNoticeOfAppearance);
	}

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc notice of appearances
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCNOTICEOFAPPEARANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"jadscNoticeOfAppearance.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscNoticeOfAppearance.uuid IS NULL OR jadscNoticeOfAppearance.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscNoticeOfAppearance.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<JADSCNoticeOfAppearance> list = null;

		if (useFinderCache) {
			list = (List<JADSCNoticeOfAppearance>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCNoticeOfAppearance jadscNoticeOfAppearance : list) {
					if (!uuid.equals(jadscNoticeOfAppearance.getUuid()) ||
						(companyId != jadscNoticeOfAppearance.getCompanyId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCNoticeOfAppearanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<JADSCNoticeOfAppearance>)QueryUtil.list(
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
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscNoticeOfAppearance != null) {
			return jadscNoticeOfAppearance;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCNoticeOfAppearanceException(sb.toString());
	}

	/**
	 * Returns the first jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		List<JADSCNoticeOfAppearance> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscNoticeOfAppearance != null) {
			return jadscNoticeOfAppearance;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCNoticeOfAppearanceException(sb.toString());
	}

	/**
	 * Returns the last jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCNoticeOfAppearance> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc notice of appearances before and after the current jadsc notice of appearance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscNOAId the primary key of the current jadsc notice of appearance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance[] findByUuid_C_PrevAndNext(
			long jadscNOAId, String uuid, long companyId,
			OrderByComparator<JADSCNoticeOfAppearance> orderByComparator)
		throws NoSuchJADSCNoticeOfAppearanceException {

		uuid = Objects.toString(uuid, "");

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = findByPrimaryKey(
			jadscNOAId);

		Session session = null;

		try {
			session = openSession();

			JADSCNoticeOfAppearance[] array =
				new JADSCNoticeOfAppearanceImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscNoticeOfAppearance, uuid, companyId,
				orderByComparator, true);

			array[1] = jadscNoticeOfAppearance;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscNoticeOfAppearance, uuid, companyId,
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

	protected JADSCNoticeOfAppearance getByUuid_C_PrevAndNext(
		Session session, JADSCNoticeOfAppearance jadscNoticeOfAppearance,
		String uuid, long companyId,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			sb.append(JADSCNoticeOfAppearanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jadscNoticeOfAppearance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCNoticeOfAppearance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc notice of appearances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCNoticeOfAppearance jadscNoticeOfAppearance :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscNoticeOfAppearance);
		}
	}

	/**
	 * Returns the number of jadsc notice of appearances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc notice of appearances
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCNOTICEOFAPPEARANCE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"jadscNoticeOfAppearance.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscNoticeOfAppearance.uuid IS NULL OR jadscNoticeOfAppearance.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscNoticeOfAppearance.companyId = ?";

	private FinderPath _finderPathFetchBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchBygetJADSCById(
			jadscApplicationId);

		if (jadscNoticeOfAppearance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCNoticeOfAppearanceException(sb.toString());
		}

		return jadscNoticeOfAppearance;
	}

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchBygetJADSCById(
		long jadscApplicationId) {

		return fetchBygetJADSCById(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc notice of appearance where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc notice of appearance, or <code>null</code> if a matching jadsc notice of appearance could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jadscApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJADSCById, finderArgs, this);
		}

		if (result instanceof JADSCNoticeOfAppearance) {
			JADSCNoticeOfAppearance jadscNoticeOfAppearance =
				(JADSCNoticeOfAppearance)result;

			if (jadscApplicationId !=
					jadscNoticeOfAppearance.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCNoticeOfAppearance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jadscApplicationId};
							}

							_log.warn(
								"JADSCNoticeOfAppearancePersistenceImpl.fetchBygetJADSCById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCNoticeOfAppearance jadscNoticeOfAppearance = list.get(
						0);

					result = jadscNoticeOfAppearance;

					cacheResult(jadscNoticeOfAppearance);
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
			return (JADSCNoticeOfAppearance)result;
		}
	}

	/**
	 * Removes the jadsc notice of appearance where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc notice of appearance that was removed
	 */
	@Override
	public JADSCNoticeOfAppearance removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = findBygetJADSCById(
			jadscApplicationId);

		return remove(jadscNoticeOfAppearance);
	}

	/**
	 * Returns the number of jadsc notice of appearances where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc notice of appearances
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCNOTICEOFAPPEARANCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

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
		_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2 =
			"jadscNoticeOfAppearance.jadscApplicationId = ?";

	public JADSCNoticeOfAppearancePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("date", "date_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCNoticeOfAppearance.class);

		setModelImplClass(JADSCNoticeOfAppearanceImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCNoticeOfAppearanceTable.INSTANCE);
	}

	/**
	 * Caches the jadsc notice of appearance in the entity cache if it is enabled.
	 *
	 * @param jadscNoticeOfAppearance the jadsc notice of appearance
	 */
	@Override
	public void cacheResult(JADSCNoticeOfAppearance jadscNoticeOfAppearance) {
		entityCache.putResult(
			JADSCNoticeOfAppearanceImpl.class,
			jadscNoticeOfAppearance.getPrimaryKey(), jadscNoticeOfAppearance);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscNoticeOfAppearance.getUuid(),
				jadscNoticeOfAppearance.getGroupId()
			},
			jadscNoticeOfAppearance);

		finderCache.putResult(
			_finderPathFetchBygetJADSCById,
			new Object[] {jadscNoticeOfAppearance.getJadscApplicationId()},
			jadscNoticeOfAppearance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc notice of appearances in the entity cache if it is enabled.
	 *
	 * @param jadscNoticeOfAppearances the jadsc notice of appearances
	 */
	@Override
	public void cacheResult(
		List<JADSCNoticeOfAppearance> jadscNoticeOfAppearances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscNoticeOfAppearances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCNoticeOfAppearance jadscNoticeOfAppearance :
				jadscNoticeOfAppearances) {

			if (entityCache.getResult(
					JADSCNoticeOfAppearanceImpl.class,
					jadscNoticeOfAppearance.getPrimaryKey()) == null) {

				cacheResult(jadscNoticeOfAppearance);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc notice of appearances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCNoticeOfAppearanceImpl.class);

		finderCache.clearCache(JADSCNoticeOfAppearanceImpl.class);
	}

	/**
	 * Clears the cache for the jadsc notice of appearance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JADSCNoticeOfAppearance jadscNoticeOfAppearance) {
		entityCache.removeResult(
			JADSCNoticeOfAppearanceImpl.class, jadscNoticeOfAppearance);
	}

	@Override
	public void clearCache(
		List<JADSCNoticeOfAppearance> jadscNoticeOfAppearances) {

		for (JADSCNoticeOfAppearance jadscNoticeOfAppearance :
				jadscNoticeOfAppearances) {

			entityCache.removeResult(
				JADSCNoticeOfAppearanceImpl.class, jadscNoticeOfAppearance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCNoticeOfAppearanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JADSCNoticeOfAppearanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCNoticeOfAppearanceModelImpl jadscNoticeOfAppearanceModelImpl) {

		Object[] args = new Object[] {
			jadscNoticeOfAppearanceModelImpl.getUuid(),
			jadscNoticeOfAppearanceModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscNoticeOfAppearanceModelImpl);

		args = new Object[] {
			jadscNoticeOfAppearanceModelImpl.getJadscApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJADSCById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCById, args,
			jadscNoticeOfAppearanceModelImpl);
	}

	/**
	 * Creates a new jadsc notice of appearance with the primary key. Does not add the jadsc notice of appearance to the database.
	 *
	 * @param jadscNOAId the primary key for the new jadsc notice of appearance
	 * @return the new jadsc notice of appearance
	 */
	@Override
	public JADSCNoticeOfAppearance create(long jadscNOAId) {
		JADSCNoticeOfAppearance jadscNoticeOfAppearance =
			new JADSCNoticeOfAppearanceImpl();

		jadscNoticeOfAppearance.setNew(true);
		jadscNoticeOfAppearance.setPrimaryKey(jadscNOAId);

		String uuid = PortalUUIDUtil.generate();

		jadscNoticeOfAppearance.setUuid(uuid);

		jadscNoticeOfAppearance.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscNoticeOfAppearance;
	}

	/**
	 * Removes the jadsc notice of appearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance remove(long jadscNOAId)
		throws NoSuchJADSCNoticeOfAppearanceException {

		return remove((Serializable)jadscNOAId);
	}

	/**
	 * Removes the jadsc notice of appearance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance that was removed
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance remove(Serializable primaryKey)
		throws NoSuchJADSCNoticeOfAppearanceException {

		Session session = null;

		try {
			session = openSession();

			JADSCNoticeOfAppearance jadscNoticeOfAppearance =
				(JADSCNoticeOfAppearance)session.get(
					JADSCNoticeOfAppearanceImpl.class, primaryKey);

			if (jadscNoticeOfAppearance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCNoticeOfAppearanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscNoticeOfAppearance);
		}
		catch (NoSuchJADSCNoticeOfAppearanceException noSuchEntityException) {
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
	protected JADSCNoticeOfAppearance removeImpl(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscNoticeOfAppearance)) {
				jadscNoticeOfAppearance = (JADSCNoticeOfAppearance)session.get(
					JADSCNoticeOfAppearanceImpl.class,
					jadscNoticeOfAppearance.getPrimaryKeyObj());
			}

			if (jadscNoticeOfAppearance != null) {
				session.delete(jadscNoticeOfAppearance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscNoticeOfAppearance != null) {
			clearCache(jadscNoticeOfAppearance);
		}

		return jadscNoticeOfAppearance;
	}

	@Override
	public JADSCNoticeOfAppearance updateImpl(
		JADSCNoticeOfAppearance jadscNoticeOfAppearance) {

		boolean isNew = jadscNoticeOfAppearance.isNew();

		if (!(jadscNoticeOfAppearance instanceof
				JADSCNoticeOfAppearanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscNoticeOfAppearance.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscNoticeOfAppearance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscNoticeOfAppearance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCNoticeOfAppearance implementation " +
					jadscNoticeOfAppearance.getClass());
		}

		JADSCNoticeOfAppearanceModelImpl jadscNoticeOfAppearanceModelImpl =
			(JADSCNoticeOfAppearanceModelImpl)jadscNoticeOfAppearance;

		if (Validator.isNull(jadscNoticeOfAppearance.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscNoticeOfAppearance.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscNoticeOfAppearance.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscNoticeOfAppearance.setCreateDate(date);
			}
			else {
				jadscNoticeOfAppearance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscNoticeOfAppearanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscNoticeOfAppearance.setModifiedDate(date);
			}
			else {
				jadscNoticeOfAppearance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscNoticeOfAppearance);
			}
			else {
				jadscNoticeOfAppearance =
					(JADSCNoticeOfAppearance)session.merge(
						jadscNoticeOfAppearance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCNoticeOfAppearanceImpl.class, jadscNoticeOfAppearanceModelImpl,
			false, true);

		cacheUniqueFindersCache(jadscNoticeOfAppearanceModelImpl);

		if (isNew) {
			jadscNoticeOfAppearance.setNew(false);
		}

		jadscNoticeOfAppearance.resetOriginalValues();

		return jadscNoticeOfAppearance;
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCNoticeOfAppearanceException {

		JADSCNoticeOfAppearance jadscNoticeOfAppearance = fetchByPrimaryKey(
			primaryKey);

		if (jadscNoticeOfAppearance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCNoticeOfAppearanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscNoticeOfAppearance;
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key or throws a <code>NoSuchJADSCNoticeOfAppearanceException</code> if it could not be found.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance
	 * @throws NoSuchJADSCNoticeOfAppearanceException if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance findByPrimaryKey(long jadscNOAId)
		throws NoSuchJADSCNoticeOfAppearanceException {

		return findByPrimaryKey((Serializable)jadscNOAId);
	}

	/**
	 * Returns the jadsc notice of appearance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscNOAId the primary key of the jadsc notice of appearance
	 * @return the jadsc notice of appearance, or <code>null</code> if a jadsc notice of appearance with the primary key could not be found
	 */
	@Override
	public JADSCNoticeOfAppearance fetchByPrimaryKey(long jadscNOAId) {
		return fetchByPrimaryKey((Serializable)jadscNOAId);
	}

	/**
	 * Returns all the jadsc notice of appearances.
	 *
	 * @return the jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @return the range of jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findAll(
		int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc notice of appearances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCNoticeOfAppearanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc notice of appearances
	 * @param end the upper bound of the range of jadsc notice of appearances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc notice of appearances
	 */
	@Override
	public List<JADSCNoticeOfAppearance> findAll(
		int start, int end,
		OrderByComparator<JADSCNoticeOfAppearance> orderByComparator,
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

		List<JADSCNoticeOfAppearance> list = null;

		if (useFinderCache) {
			list = (List<JADSCNoticeOfAppearance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCNOTICEOFAPPEARANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCNOTICEOFAPPEARANCE;

				sql = sql.concat(
					JADSCNoticeOfAppearanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCNoticeOfAppearance>)QueryUtil.list(
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
	 * Removes all the jadsc notice of appearances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCNoticeOfAppearance jadscNoticeOfAppearance : findAll()) {
			remove(jadscNoticeOfAppearance);
		}
	}

	/**
	 * Returns the number of jadsc notice of appearances.
	 *
	 * @return the number of jadsc notice of appearances
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
					_SQL_COUNT_JADSCNOTICEOFAPPEARANCE);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "jadscNOAId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCNOTICEOFAPPEARANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCNoticeOfAppearanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc notice of appearance persistence.
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

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathFetchBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		JADSCNoticeOfAppearanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCNoticeOfAppearanceUtil.setPersistence(null);

		entityCache.removeCache(JADSCNoticeOfAppearanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCNOTICEOFAPPEARANCE =
		"SELECT jadscNoticeOfAppearance FROM JADSCNoticeOfAppearance jadscNoticeOfAppearance";

	private static final String _SQL_SELECT_JADSCNOTICEOFAPPEARANCE_WHERE =
		"SELECT jadscNoticeOfAppearance FROM JADSCNoticeOfAppearance jadscNoticeOfAppearance WHERE ";

	private static final String _SQL_COUNT_JADSCNOTICEOFAPPEARANCE =
		"SELECT COUNT(jadscNoticeOfAppearance) FROM JADSCNoticeOfAppearance jadscNoticeOfAppearance";

	private static final String _SQL_COUNT_JADSCNOTICEOFAPPEARANCE_WHERE =
		"SELECT COUNT(jadscNoticeOfAppearance) FROM JADSCNoticeOfAppearance jadscNoticeOfAppearance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscNoticeOfAppearance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCNoticeOfAppearance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCNoticeOfAppearance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCNoticeOfAppearancePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "date"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}