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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCCertificateOfVeracityException;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracityTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfVeracityPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfVeracityUtil;
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
 * The persistence implementation for the jadsc certificate of veracity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCCertificateOfVeracityPersistence.class)
public class JADSCCertificateOfVeracityPersistenceImpl
	extends BasePersistenceImpl<JADSCCertificateOfVeracity>
	implements JADSCCertificateOfVeracityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCCertificateOfVeracityUtil</code> to access the jadsc certificate of veracity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCCertificateOfVeracityImpl.class.getName();

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
	 * Returns all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
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

		List<JADSCCertificateOfVeracity> list = null;

		if (useFinderCache) {
			list = (List<JADSCCertificateOfVeracity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
						list) {

					if (!uuid.equals(jadscCertificateOfVeracity.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
				sb.append(JADSCCertificateOfVeracityModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCertificateOfVeracity>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByUuid_First(
			String uuid,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			fetchByUuid_First(uuid, orderByComparator);

		if (jadscCertificateOfVeracity != null) {
			return jadscCertificateOfVeracity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfVeracityException(sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		List<JADSCCertificateOfVeracity> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			fetchByUuid_Last(uuid, orderByComparator);

		if (jadscCertificateOfVeracity != null) {
			return jadscCertificateOfVeracity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfVeracityException(sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfVeracity> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of veracities before and after the current jadsc certificate of veracity in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOVId the primary key of the current jadsc certificate of veracity
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity[] findByUuid_PrevAndNext(
			long jadscCOVId, String uuid,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException {

		uuid = Objects.toString(uuid, "");

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			findByPrimaryKey(jadscCOVId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfVeracity[] array =
				new JADSCCertificateOfVeracityImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscCertificateOfVeracity, uuid, orderByComparator,
				true);

			array[1] = jadscCertificateOfVeracity;

			array[2] = getByUuid_PrevAndNext(
				session, jadscCertificateOfVeracity, uuid, orderByComparator,
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

	protected JADSCCertificateOfVeracity getByUuid_PrevAndNext(
		Session session, JADSCCertificateOfVeracity jadscCertificateOfVeracity,
		String uuid,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
			sb.append(JADSCCertificateOfVeracityModelImpl.ORDER_BY_JPQL);
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
						jadscCertificateOfVeracity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfVeracity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of veracities where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscCertificateOfVeracity);
		}
	}

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of veracities
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
		"jadscCertificateOfVeracity.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscCertificateOfVeracity.uuid IS NULL OR jadscCertificateOfVeracity.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity = fetchByUUID_G(
			uuid, groupId);

		if (jadscCertificateOfVeracity == null) {
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

			throw new NoSuchJADSCCertificateOfVeracityException(sb.toString());
		}

		return jadscCertificateOfVeracity;
	}

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByUUID_G(
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

		if (result instanceof JADSCCertificateOfVeracity) {
			JADSCCertificateOfVeracity jadscCertificateOfVeracity =
				(JADSCCertificateOfVeracity)result;

			if (!Objects.equals(uuid, jadscCertificateOfVeracity.getUuid()) ||
				(groupId != jadscCertificateOfVeracity.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE);

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

				List<JADSCCertificateOfVeracity> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCCertificateOfVeracity jadscCertificateOfVeracity =
						list.get(0);

					result = jadscCertificateOfVeracity;

					cacheResult(jadscCertificateOfVeracity);
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
			return (JADSCCertificateOfVeracity)result;
		}
	}

	/**
	 * Removes the jadsc certificate of veracity where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of veracity that was removed
	 */
	@Override
	public JADSCCertificateOfVeracity removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity = findByUUID_G(
			uuid, groupId);

		return remove(jadscCertificateOfVeracity);
	}

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
		"jadscCertificateOfVeracity.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscCertificateOfVeracity.uuid IS NULL OR jadscCertificateOfVeracity.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscCertificateOfVeracity.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
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

		List<JADSCCertificateOfVeracity> list = null;

		if (useFinderCache) {
			list = (List<JADSCCertificateOfVeracity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
						list) {

					if (!uuid.equals(jadscCertificateOfVeracity.getUuid()) ||
						(companyId !=
							jadscCertificateOfVeracity.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
				sb.append(JADSCCertificateOfVeracityModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCCertificateOfVeracity>)QueryUtil.list(
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
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (jadscCertificateOfVeracity != null) {
			return jadscCertificateOfVeracity;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfVeracityException(sb.toString());
	}

	/**
	 * Returns the first jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		List<JADSCCertificateOfVeracity> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (jadscCertificateOfVeracity != null) {
			return jadscCertificateOfVeracity;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCCertificateOfVeracityException(sb.toString());
	}

	/**
	 * Returns the last jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCCertificateOfVeracity> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc certificate of veracities before and after the current jadsc certificate of veracity in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOVId the primary key of the current jadsc certificate of veracity
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity[] findByUuid_C_PrevAndNext(
			long jadscCOVId, String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfVeracity> orderByComparator)
		throws NoSuchJADSCCertificateOfVeracityException {

		uuid = Objects.toString(uuid, "");

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			findByPrimaryKey(jadscCOVId);

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfVeracity[] array =
				new JADSCCertificateOfVeracityImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscCertificateOfVeracity, uuid, companyId,
				orderByComparator, true);

			array[1] = jadscCertificateOfVeracity;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscCertificateOfVeracity, uuid, companyId,
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

	protected JADSCCertificateOfVeracity getByUuid_C_PrevAndNext(
		Session session, JADSCCertificateOfVeracity jadscCertificateOfVeracity,
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
			sb.append(JADSCCertificateOfVeracityModelImpl.ORDER_BY_JPQL);
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
						jadscCertificateOfVeracity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCCertificateOfVeracity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc certificate of veracities where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscCertificateOfVeracity);
		}
	}

	/**
	 * Returns the number of jadsc certificate of veracities where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
		"jadscCertificateOfVeracity.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscCertificateOfVeracity.uuid IS NULL OR jadscCertificateOfVeracity.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscCertificateOfVeracity.companyId = ?";

	private FinderPath _finderPathFetchBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findBygetJADSCById(
			long jadscApplicationId)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			fetchBygetJADSCById(jadscApplicationId);

		if (jadscCertificateOfVeracity == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCCertificateOfVeracityException(sb.toString());
		}

		return jadscCertificateOfVeracity;
	}

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchBygetJADSCById(
		long jadscApplicationId) {

		return fetchBygetJADSCById(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc certificate of veracity where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of veracity, or <code>null</code> if a matching jadsc certificate of veracity could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchBygetJADSCById(
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

		if (result instanceof JADSCCertificateOfVeracity) {
			JADSCCertificateOfVeracity jadscCertificateOfVeracity =
				(JADSCCertificateOfVeracity)result;

			if (jadscApplicationId !=
					jadscCertificateOfVeracity.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCCertificateOfVeracity> list = query.list();

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
								"JADSCCertificateOfVeracityPersistenceImpl.fetchBygetJADSCById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCCertificateOfVeracity jadscCertificateOfVeracity =
						list.get(0);

					result = jadscCertificateOfVeracity;

					cacheResult(jadscCertificateOfVeracity);
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
			return (JADSCCertificateOfVeracity)result;
		}
	}

	/**
	 * Removes the jadsc certificate of veracity where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc certificate of veracity that was removed
	 */
	@Override
	public JADSCCertificateOfVeracity removeBygetJADSCById(
			long jadscApplicationId)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			findBygetJADSCById(jadscApplicationId);

		return remove(jadscCertificateOfVeracity);
	}

	/**
	 * Returns the number of jadsc certificate of veracities where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of veracities
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCCERTIFICATEOFVERACITY_WHERE);

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
			"jadscCertificateOfVeracity.jadscApplicationId = ?";

	public JADSCCertificateOfVeracityPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCCertificateOfVeracity.class);

		setModelImplClass(JADSCCertificateOfVeracityImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCCertificateOfVeracityTable.INSTANCE);
	}

	/**
	 * Caches the jadsc certificate of veracity in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfVeracity the jadsc certificate of veracity
	 */
	@Override
	public void cacheResult(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		entityCache.putResult(
			JADSCCertificateOfVeracityImpl.class,
			jadscCertificateOfVeracity.getPrimaryKey(),
			jadscCertificateOfVeracity);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscCertificateOfVeracity.getUuid(),
				jadscCertificateOfVeracity.getGroupId()
			},
			jadscCertificateOfVeracity);

		finderCache.putResult(
			_finderPathFetchBygetJADSCById,
			new Object[] {jadscCertificateOfVeracity.getJadscApplicationId()},
			jadscCertificateOfVeracity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc certificate of veracities in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfVeracities the jadsc certificate of veracities
	 */
	@Override
	public void cacheResult(
		List<JADSCCertificateOfVeracity> jadscCertificateOfVeracities) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscCertificateOfVeracities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
				jadscCertificateOfVeracities) {

			if (entityCache.getResult(
					JADSCCertificateOfVeracityImpl.class,
					jadscCertificateOfVeracity.getPrimaryKey()) == null) {

				cacheResult(jadscCertificateOfVeracity);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc certificate of veracities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCCertificateOfVeracityImpl.class);

		finderCache.clearCache(JADSCCertificateOfVeracityImpl.class);
	}

	/**
	 * Clears the cache for the jadsc certificate of veracity.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		entityCache.removeResult(
			JADSCCertificateOfVeracityImpl.class, jadscCertificateOfVeracity);
	}

	@Override
	public void clearCache(
		List<JADSCCertificateOfVeracity> jadscCertificateOfVeracities) {

		for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
				jadscCertificateOfVeracities) {

			entityCache.removeResult(
				JADSCCertificateOfVeracityImpl.class,
				jadscCertificateOfVeracity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCCertificateOfVeracityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JADSCCertificateOfVeracityImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCCertificateOfVeracityModelImpl
			jadscCertificateOfVeracityModelImpl) {

		Object[] args = new Object[] {
			jadscCertificateOfVeracityModelImpl.getUuid(),
			jadscCertificateOfVeracityModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			jadscCertificateOfVeracityModelImpl);

		args = new Object[] {
			jadscCertificateOfVeracityModelImpl.getJadscApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJADSCById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCById, args,
			jadscCertificateOfVeracityModelImpl);
	}

	/**
	 * Creates a new jadsc certificate of veracity with the primary key. Does not add the jadsc certificate of veracity to the database.
	 *
	 * @param jadscCOVId the primary key for the new jadsc certificate of veracity
	 * @return the new jadsc certificate of veracity
	 */
	@Override
	public JADSCCertificateOfVeracity create(long jadscCOVId) {
		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			new JADSCCertificateOfVeracityImpl();

		jadscCertificateOfVeracity.setNew(true);
		jadscCertificateOfVeracity.setPrimaryKey(jadscCOVId);

		String uuid = PortalUUIDUtil.generate();

		jadscCertificateOfVeracity.setUuid(uuid);

		jadscCertificateOfVeracity.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return jadscCertificateOfVeracity;
	}

	/**
	 * Removes the jadsc certificate of veracity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity remove(long jadscCOVId)
		throws NoSuchJADSCCertificateOfVeracityException {

		return remove((Serializable)jadscCOVId);
	}

	/**
	 * Removes the jadsc certificate of veracity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity that was removed
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity remove(Serializable primaryKey)
		throws NoSuchJADSCCertificateOfVeracityException {

		Session session = null;

		try {
			session = openSession();

			JADSCCertificateOfVeracity jadscCertificateOfVeracity =
				(JADSCCertificateOfVeracity)session.get(
					JADSCCertificateOfVeracityImpl.class, primaryKey);

			if (jadscCertificateOfVeracity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCCertificateOfVeracityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscCertificateOfVeracity);
		}
		catch (NoSuchJADSCCertificateOfVeracityException
					noSuchEntityException) {

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
	protected JADSCCertificateOfVeracity removeImpl(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscCertificateOfVeracity)) {
				jadscCertificateOfVeracity =
					(JADSCCertificateOfVeracity)session.get(
						JADSCCertificateOfVeracityImpl.class,
						jadscCertificateOfVeracity.getPrimaryKeyObj());
			}

			if (jadscCertificateOfVeracity != null) {
				session.delete(jadscCertificateOfVeracity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscCertificateOfVeracity != null) {
			clearCache(jadscCertificateOfVeracity);
		}

		return jadscCertificateOfVeracity;
	}

	@Override
	public JADSCCertificateOfVeracity updateImpl(
		JADSCCertificateOfVeracity jadscCertificateOfVeracity) {

		boolean isNew = jadscCertificateOfVeracity.isNew();

		if (!(jadscCertificateOfVeracity instanceof
				JADSCCertificateOfVeracityModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscCertificateOfVeracity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscCertificateOfVeracity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscCertificateOfVeracity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCCertificateOfVeracity implementation " +
					jadscCertificateOfVeracity.getClass());
		}

		JADSCCertificateOfVeracityModelImpl
			jadscCertificateOfVeracityModelImpl =
				(JADSCCertificateOfVeracityModelImpl)jadscCertificateOfVeracity;

		if (Validator.isNull(jadscCertificateOfVeracity.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscCertificateOfVeracity.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscCertificateOfVeracity.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscCertificateOfVeracity.setCreateDate(date);
			}
			else {
				jadscCertificateOfVeracity.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscCertificateOfVeracityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscCertificateOfVeracity.setModifiedDate(date);
			}
			else {
				jadscCertificateOfVeracity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscCertificateOfVeracity);
			}
			else {
				jadscCertificateOfVeracity =
					(JADSCCertificateOfVeracity)session.merge(
						jadscCertificateOfVeracity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCCertificateOfVeracityImpl.class,
			jadscCertificateOfVeracityModelImpl, false, true);

		cacheUniqueFindersCache(jadscCertificateOfVeracityModelImpl);

		if (isNew) {
			jadscCertificateOfVeracity.setNew(false);
		}

		jadscCertificateOfVeracity.resetOriginalValues();

		return jadscCertificateOfVeracity;
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCCertificateOfVeracityException {

		JADSCCertificateOfVeracity jadscCertificateOfVeracity =
			fetchByPrimaryKey(primaryKey);

		if (jadscCertificateOfVeracity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCCertificateOfVeracityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscCertificateOfVeracity;
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key or throws a <code>NoSuchJADSCCertificateOfVeracityException</code> if it could not be found.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity
	 * @throws NoSuchJADSCCertificateOfVeracityException if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity findByPrimaryKey(long jadscCOVId)
		throws NoSuchJADSCCertificateOfVeracityException {

		return findByPrimaryKey((Serializable)jadscCOVId);
	}

	/**
	 * Returns the jadsc certificate of veracity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOVId the primary key of the jadsc certificate of veracity
	 * @return the jadsc certificate of veracity, or <code>null</code> if a jadsc certificate of veracity with the primary key could not be found
	 */
	@Override
	public JADSCCertificateOfVeracity fetchByPrimaryKey(long jadscCOVId) {
		return fetchByPrimaryKey((Serializable)jadscCOVId);
	}

	/**
	 * Returns all the jadsc certificate of veracities.
	 *
	 * @return the jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @return the range of jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of veracities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfVeracityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of veracities
	 * @param end the upper bound of the range of jadsc certificate of veracities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of veracities
	 */
	@Override
	public List<JADSCCertificateOfVeracity> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfVeracity> orderByComparator,
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

		List<JADSCCertificateOfVeracity> list = null;

		if (useFinderCache) {
			list = (List<JADSCCertificateOfVeracity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCCERTIFICATEOFVERACITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCCERTIFICATEOFVERACITY;

				sql = sql.concat(
					JADSCCertificateOfVeracityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCCertificateOfVeracity>)QueryUtil.list(
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
	 * Removes all the jadsc certificate of veracities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCCertificateOfVeracity jadscCertificateOfVeracity :
				findAll()) {

			remove(jadscCertificateOfVeracity);
		}
	}

	/**
	 * Returns the number of jadsc certificate of veracities.
	 *
	 * @return the number of jadsc certificate of veracities
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
					_SQL_COUNT_JADSCCERTIFICATEOFVERACITY);

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
		return "jadscCOVId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCCERTIFICATEOFVERACITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCCertificateOfVeracityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc certificate of veracity persistence.
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

		JADSCCertificateOfVeracityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCCertificateOfVeracityUtil.setPersistence(null);

		entityCache.removeCache(JADSCCertificateOfVeracityImpl.class.getName());
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

	private static final String _SQL_SELECT_JADSCCERTIFICATEOFVERACITY =
		"SELECT jadscCertificateOfVeracity FROM JADSCCertificateOfVeracity jadscCertificateOfVeracity";

	private static final String _SQL_SELECT_JADSCCERTIFICATEOFVERACITY_WHERE =
		"SELECT jadscCertificateOfVeracity FROM JADSCCertificateOfVeracity jadscCertificateOfVeracity WHERE ";

	private static final String _SQL_COUNT_JADSCCERTIFICATEOFVERACITY =
		"SELECT COUNT(jadscCertificateOfVeracity) FROM JADSCCertificateOfVeracity jadscCertificateOfVeracity";

	private static final String _SQL_COUNT_JADSCCERTIFICATEOFVERACITY_WHERE =
		"SELECT COUNT(jadscCertificateOfVeracity) FROM JADSCCertificateOfVeracity jadscCertificateOfVeracity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jadscCertificateOfVeracity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCCertificateOfVeracity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCCertificateOfVeracity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCCertificateOfVeracityPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}