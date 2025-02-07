/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesApplicantinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesApplicantinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesApplicantinfoUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

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
 * The persistence implementation for the osi services applicantinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesApplicantinfoPersistence.class)
public class OsiServicesApplicantinfoPersistenceImpl
	extends BasePersistenceImpl<OsiServicesApplicantinfo>
	implements OsiServicesApplicantinfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesApplicantinfoUtil</code> to access the osi services applicantinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesApplicantinfoImpl.class.getName();

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
	 * Returns all the osi services applicantinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applicantinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator,
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

		List<OsiServicesApplicantinfo> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplicantinfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplicantinfo osiServicesApplicantinfo : list) {
					if (!uuid.equals(osiServicesApplicantinfo.getUuid())) {
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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE);

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
				sb.append(OsiServicesApplicantinfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesApplicantinfo>)QueryUtil.list(
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
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = fetchByUuid_First(
			uuid, orderByComparator);

		if (osiServicesApplicantinfo != null) {
			return osiServicesApplicantinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesApplicantinfoException(sb.toString());
	}

	/**
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		List<OsiServicesApplicantinfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = fetchByUuid_Last(
			uuid, orderByComparator);

		if (osiServicesApplicantinfo != null) {
			return osiServicesApplicantinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesApplicantinfoException(sb.toString());
	}

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplicantinfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applicantinfos before and after the current osi services applicantinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesApplicanId the primary key of the current osi services applicantinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo[] findByUuid_PrevAndNext(
			long osiServicesApplicanId, String uuid,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesApplicantinfo osiServicesApplicantinfo = findByPrimaryKey(
			osiServicesApplicanId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplicantinfo[] array =
				new OsiServicesApplicantinfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesApplicantinfo, uuid, orderByComparator,
				true);

			array[1] = osiServicesApplicantinfo;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesApplicantinfo, uuid, orderByComparator,
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

	protected OsiServicesApplicantinfo getByUuid_PrevAndNext(
		Session session, OsiServicesApplicantinfo osiServicesApplicantinfo,
		String uuid,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE);

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
			sb.append(OsiServicesApplicantinfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplicantinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplicantinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applicantinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesApplicantinfo osiServicesApplicantinfo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesApplicantinfo);
		}
	}

	/**
	 * Returns the number of osi services applicantinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services applicantinfos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICANTINFO_WHERE);

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
		"osiServicesApplicantinfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesApplicantinfo.uuid IS NULL OR osiServicesApplicantinfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services applicantinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesApplicantinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = fetchByUUID_G(
			uuid, groupId);

		if (osiServicesApplicantinfo == null) {
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

			throw new NoSuchOsiServicesApplicantinfoException(sb.toString());
		}

		return osiServicesApplicantinfo;
	}

	/**
	 * Returns the osi services applicantinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services applicantinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByUUID_G(
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

		if (result instanceof OsiServicesApplicantinfo) {
			OsiServicesApplicantinfo osiServicesApplicantinfo =
				(OsiServicesApplicantinfo)result;

			if (!Objects.equals(uuid, osiServicesApplicantinfo.getUuid()) ||
				(groupId != osiServicesApplicantinfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE);

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

				List<OsiServicesApplicantinfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesApplicantinfo osiServicesApplicantinfo =
						list.get(0);

					result = osiServicesApplicantinfo;

					cacheResult(osiServicesApplicantinfo);
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
			return (OsiServicesApplicantinfo)result;
		}
	}

	/**
	 * Removes the osi services applicantinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services applicantinfo that was removed
	 */
	@Override
	public OsiServicesApplicantinfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = findByUUID_G(
			uuid, groupId);

		return remove(osiServicesApplicantinfo);
	}

	/**
	 * Returns the number of osi services applicantinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services applicantinfos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICANTINFO_WHERE);

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
		"osiServicesApplicantinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesApplicantinfo.uuid IS NULL OR osiServicesApplicantinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesApplicantinfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator,
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

		List<OsiServicesApplicantinfo> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplicantinfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplicantinfo osiServicesApplicantinfo : list) {
					if (!uuid.equals(osiServicesApplicantinfo.getUuid()) ||
						(companyId !=
							osiServicesApplicantinfo.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE);

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
				sb.append(OsiServicesApplicantinfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesApplicantinfo>)QueryUtil.list(
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
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (osiServicesApplicantinfo != null) {
			return osiServicesApplicantinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicantinfoException(sb.toString());
	}

	/**
	 * Returns the first osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		List<OsiServicesApplicantinfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (osiServicesApplicantinfo != null) {
			return osiServicesApplicantinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicantinfoException(sb.toString());
	}

	/**
	 * Returns the last osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplicantinfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applicantinfos before and after the current osi services applicantinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesApplicanId the primary key of the current osi services applicantinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo[] findByUuid_C_PrevAndNext(
			long osiServicesApplicanId, String uuid, long companyId,
			OrderByComparator<OsiServicesApplicantinfo> orderByComparator)
		throws NoSuchOsiServicesApplicantinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesApplicantinfo osiServicesApplicantinfo = findByPrimaryKey(
			osiServicesApplicanId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplicantinfo[] array =
				new OsiServicesApplicantinfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesApplicantinfo, uuid, companyId,
				orderByComparator, true);

			array[1] = osiServicesApplicantinfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesApplicantinfo, uuid, companyId,
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

	protected OsiServicesApplicantinfo getByUuid_C_PrevAndNext(
		Session session, OsiServicesApplicantinfo osiServicesApplicantinfo,
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE);

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
			sb.append(OsiServicesApplicantinfoModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplicantinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplicantinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applicantinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesApplicantinfo osiServicesApplicantinfo :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiServicesApplicantinfo);
		}
	}

	/**
	 * Returns the number of osi services applicantinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services applicantinfos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICANTINFO_WHERE);

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
		"osiServicesApplicantinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesApplicantinfo.uuid IS NULL OR osiServicesApplicantinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesApplicantinfo.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services applicantinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesApplicantinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo =
			fetchBygetOsiServicesById(osiServicesApplicationId);

		if (osiServicesApplicantinfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesApplicantinfoException(sb.toString());
		}

		return osiServicesApplicantinfo;
	}

	/**
	 * Returns the osi services applicantinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services applicantinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services applicantinfo, or <code>null</code> if a matching osi services applicantinfo could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiServicesById, finderArgs, this);
		}

		if (result instanceof OsiServicesApplicantinfo) {
			OsiServicesApplicantinfo osiServicesApplicantinfo =
				(OsiServicesApplicantinfo)result;

			if (osiServicesApplicationId !=
					osiServicesApplicantinfo.getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesApplicantinfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiServicesById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OsiServicesApplicantinfoPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesApplicantinfo osiServicesApplicantinfo =
						list.get(0);

					result = osiServicesApplicantinfo;

					cacheResult(osiServicesApplicantinfo);
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
			return (OsiServicesApplicantinfo)result;
		}
	}

	/**
	 * Removes the osi services applicantinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services applicantinfo that was removed
	 */
	@Override
	public OsiServicesApplicantinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo =
			findBygetOsiServicesById(osiServicesApplicationId);

		return remove(osiServicesApplicantinfo);
	}

	/**
	 * Returns the number of osi services applicantinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services applicantinfos
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICANTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2 =
			"osiServicesApplicantinfo.osiServicesApplicationId = ?";

	public OsiServicesApplicantinfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesApplicantinfo.class);

		setModelImplClass(OsiServicesApplicantinfoImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesApplicantinfoTable.INSTANCE);
	}

	/**
	 * Caches the osi services applicantinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplicantinfo the osi services applicantinfo
	 */
	@Override
	public void cacheResult(OsiServicesApplicantinfo osiServicesApplicantinfo) {
		entityCache.putResult(
			OsiServicesApplicantinfoImpl.class,
			osiServicesApplicantinfo.getPrimaryKey(), osiServicesApplicantinfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesApplicantinfo.getUuid(),
				osiServicesApplicantinfo.getGroupId()
			},
			osiServicesApplicantinfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {
				osiServicesApplicantinfo.getOsiServicesApplicationId()
			},
			osiServicesApplicantinfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services applicantinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplicantinfos the osi services applicantinfos
	 */
	@Override
	public void cacheResult(
		List<OsiServicesApplicantinfo> osiServicesApplicantinfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesApplicantinfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesApplicantinfo osiServicesApplicantinfo :
				osiServicesApplicantinfos) {

			if (entityCache.getResult(
					OsiServicesApplicantinfoImpl.class,
					osiServicesApplicantinfo.getPrimaryKey()) == null) {

				cacheResult(osiServicesApplicantinfo);
			}
		}
	}

	/**
	 * Clears the cache for all osi services applicantinfos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiServicesApplicantinfoImpl.class);

		finderCache.clearCache(OsiServicesApplicantinfoImpl.class);
	}

	/**
	 * Clears the cache for the osi services applicantinfo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiServicesApplicantinfo osiServicesApplicantinfo) {
		entityCache.removeResult(
			OsiServicesApplicantinfoImpl.class, osiServicesApplicantinfo);
	}

	@Override
	public void clearCache(
		List<OsiServicesApplicantinfo> osiServicesApplicantinfos) {

		for (OsiServicesApplicantinfo osiServicesApplicantinfo :
				osiServicesApplicantinfos) {

			entityCache.removeResult(
				OsiServicesApplicantinfoImpl.class, osiServicesApplicantinfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiServicesApplicantinfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesApplicantinfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesApplicantinfoModelImpl osiServicesApplicantinfoModelImpl) {

		Object[] args = new Object[] {
			osiServicesApplicantinfoModelImpl.getUuid(),
			osiServicesApplicantinfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, osiServicesApplicantinfoModelImpl);

		args = new Object[] {
			osiServicesApplicantinfoModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesApplicantinfoModelImpl);
	}

	/**
	 * Creates a new osi services applicantinfo with the primary key. Does not add the osi services applicantinfo to the database.
	 *
	 * @param osiServicesApplicanId the primary key for the new osi services applicantinfo
	 * @return the new osi services applicantinfo
	 */
	@Override
	public OsiServicesApplicantinfo create(long osiServicesApplicanId) {
		OsiServicesApplicantinfo osiServicesApplicantinfo =
			new OsiServicesApplicantinfoImpl();

		osiServicesApplicantinfo.setNew(true);
		osiServicesApplicantinfo.setPrimaryKey(osiServicesApplicanId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesApplicantinfo.setUuid(uuid);

		osiServicesApplicantinfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServicesApplicantinfo;
	}

	/**
	 * Removes the osi services applicantinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo remove(long osiServicesApplicanId)
		throws NoSuchOsiServicesApplicantinfoException {

		return remove((Serializable)osiServicesApplicanId);
	}

	/**
	 * Removes the osi services applicantinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo that was removed
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo remove(Serializable primaryKey)
		throws NoSuchOsiServicesApplicantinfoException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplicantinfo osiServicesApplicantinfo =
				(OsiServicesApplicantinfo)session.get(
					OsiServicesApplicantinfoImpl.class, primaryKey);

			if (osiServicesApplicantinfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesApplicantinfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesApplicantinfo);
		}
		catch (NoSuchOsiServicesApplicantinfoException noSuchEntityException) {
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
	protected OsiServicesApplicantinfo removeImpl(
		OsiServicesApplicantinfo osiServicesApplicantinfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesApplicantinfo)) {
				osiServicesApplicantinfo =
					(OsiServicesApplicantinfo)session.get(
						OsiServicesApplicantinfoImpl.class,
						osiServicesApplicantinfo.getPrimaryKeyObj());
			}

			if (osiServicesApplicantinfo != null) {
				session.delete(osiServicesApplicantinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesApplicantinfo != null) {
			clearCache(osiServicesApplicantinfo);
		}

		return osiServicesApplicantinfo;
	}

	@Override
	public OsiServicesApplicantinfo updateImpl(
		OsiServicesApplicantinfo osiServicesApplicantinfo) {

		boolean isNew = osiServicesApplicantinfo.isNew();

		if (!(osiServicesApplicantinfo instanceof
				OsiServicesApplicantinfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServicesApplicantinfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesApplicantinfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesApplicantinfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesApplicantinfo implementation " +
					osiServicesApplicantinfo.getClass());
		}

		OsiServicesApplicantinfoModelImpl osiServicesApplicantinfoModelImpl =
			(OsiServicesApplicantinfoModelImpl)osiServicesApplicantinfo;

		if (Validator.isNull(osiServicesApplicantinfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiServicesApplicantinfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServicesApplicantinfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServicesApplicantinfo.setCreateDate(date);
			}
			else {
				osiServicesApplicantinfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesApplicantinfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServicesApplicantinfo.setModifiedDate(date);
			}
			else {
				osiServicesApplicantinfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesApplicantinfo);
			}
			else {
				osiServicesApplicantinfo =
					(OsiServicesApplicantinfo)session.merge(
						osiServicesApplicantinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesApplicantinfoImpl.class,
			osiServicesApplicantinfoModelImpl, false, true);

		cacheUniqueFindersCache(osiServicesApplicantinfoModelImpl);

		if (isNew) {
			osiServicesApplicantinfo.setNew(false);
		}

		osiServicesApplicantinfo.resetOriginalValues();

		return osiServicesApplicantinfo;
	}

	/**
	 * Returns the osi services applicantinfo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiServicesApplicantinfoException {

		OsiServicesApplicantinfo osiServicesApplicantinfo = fetchByPrimaryKey(
			primaryKey);

		if (osiServicesApplicantinfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesApplicantinfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesApplicantinfo;
	}

	/**
	 * Returns the osi services applicantinfo with the primary key or throws a <code>NoSuchOsiServicesApplicantinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo
	 * @throws NoSuchOsiServicesApplicantinfoException if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo findByPrimaryKey(long osiServicesApplicanId)
		throws NoSuchOsiServicesApplicantinfoException {

		return findByPrimaryKey((Serializable)osiServicesApplicanId);
	}

	/**
	 * Returns the osi services applicantinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesApplicanId the primary key of the osi services applicantinfo
	 * @return the osi services applicantinfo, or <code>null</code> if a osi services applicantinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesApplicantinfo fetchByPrimaryKey(
		long osiServicesApplicanId) {

		return fetchByPrimaryKey((Serializable)osiServicesApplicanId);
	}

	/**
	 * Returns all the osi services applicantinfos.
	 *
	 * @return the osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @return the range of osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applicantinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicantinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applicantinfos
	 * @param end the upper bound of the range of osi services applicantinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services applicantinfos
	 */
	@Override
	public List<OsiServicesApplicantinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesApplicantinfo> orderByComparator,
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

		List<OsiServicesApplicantinfo> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplicantinfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESAPPLICANTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESAPPLICANTINFO;

				sql = sql.concat(
					OsiServicesApplicantinfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiServicesApplicantinfo>)QueryUtil.list(
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
	 * Removes all the osi services applicantinfos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesApplicantinfo osiServicesApplicantinfo : findAll()) {
			remove(osiServicesApplicantinfo);
		}
	}

	/**
	 * Returns the number of osi services applicantinfos.
	 *
	 * @return the number of osi services applicantinfos
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
					_SQL_COUNT_OSISERVICESAPPLICANTINFO);

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
		return "osiServicesApplicanId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESAPPLICANTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesApplicantinfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services applicantinfo persistence.
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

		_finderPathFetchBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiServicesById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServicesById", new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OsiServicesApplicantinfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesApplicantinfoUtil.setPersistence(null);

		entityCache.removeCache(OsiServicesApplicantinfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICESAPPLICANTINFO =
		"SELECT osiServicesApplicantinfo FROM OsiServicesApplicantinfo osiServicesApplicantinfo";

	private static final String _SQL_SELECT_OSISERVICESAPPLICANTINFO_WHERE =
		"SELECT osiServicesApplicantinfo FROM OsiServicesApplicantinfo osiServicesApplicantinfo WHERE ";

	private static final String _SQL_COUNT_OSISERVICESAPPLICANTINFO =
		"SELECT COUNT(osiServicesApplicantinfo) FROM OsiServicesApplicantinfo osiServicesApplicantinfo";

	private static final String _SQL_COUNT_OSISERVICESAPPLICANTINFO_WHERE =
		"SELECT COUNT(osiServicesApplicantinfo) FROM OsiServicesApplicantinfo osiServicesApplicantinfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesApplicantinfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesApplicantinfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesApplicantinfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesApplicantinfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}