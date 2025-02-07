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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesGeneralBenefitOfCreditorsinfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesGeneralBenefitOfCreditorsinfoModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesGeneralBenefitOfCreditorsinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesGeneralBenefitOfCreditorsinfoUtil;
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
 * The persistence implementation for the osi services general benefit of creditorsinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesGeneralBenefitOfCreditorsinfoPersistence.class)
public class OsiServicesGeneralBenefitOfCreditorsinfoPersistenceImpl
	extends BasePersistenceImpl<OsiServicesGeneralBenefitOfCreditorsinfo>
	implements OsiServicesGeneralBenefitOfCreditorsinfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesGeneralBenefitOfCreditorsinfoUtil</code> to access the osi services general benefit of creditorsinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesGeneralBenefitOfCreditorsinfoImpl.class.getName();

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
	 * Returns all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid) {

		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator,
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

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesGeneralBenefitOfCreditorsinfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo : list) {

					if (!uuid.equals(
							osiServicesGeneralBenefitOfCreditorsinfo.
								getUuid())) {

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

			sb.append(
				_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
				sb.append(
					OsiServicesGeneralBenefitOfCreditorsinfoModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<OsiServicesGeneralBenefitOfCreditorsinfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = fetchByUuid_First(
				uuid, orderByComparator);

		if (osiServicesGeneralBenefitOfCreditorsinfo != null) {
			return osiServicesGeneralBenefitOfCreditorsinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = fetchByUuid_Last(
				uuid, orderByComparator);

		if (osiServicesGeneralBenefitOfCreditorsinfo != null) {
			return osiServicesGeneralBenefitOfCreditorsinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services general benefit of creditorsinfos before and after the current osi services general benefit of creditorsinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osiBOCInsoId the primary key of the current osi services general benefit of creditorsinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo[] findByUuid_PrevAndNext(
			long osiBOCInsoId, String uuid,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = findByPrimaryKey(
				osiBOCInsoId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesGeneralBenefitOfCreditorsinfo[] array =
				new OsiServicesGeneralBenefitOfCreditorsinfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesGeneralBenefitOfCreditorsinfo, uuid,
				orderByComparator, true);

			array[1] = osiServicesGeneralBenefitOfCreditorsinfo;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesGeneralBenefitOfCreditorsinfo, uuid,
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

	protected OsiServicesGeneralBenefitOfCreditorsinfo getByUuid_PrevAndNext(
		Session session,
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo,
		String uuid,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
			sb.append(
				OsiServicesGeneralBenefitOfCreditorsinfoModelImpl.
					ORDER_BY_JPQL);
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
						osiServicesGeneralBenefitOfCreditorsinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services general benefit of creditorsinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesGeneralBenefitOfCreditorsinfo);
		}
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
		"osiServicesGeneralBenefitOfCreditorsinfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesGeneralBenefitOfCreditorsinfo.uuid IS NULL OR osiServicesGeneralBenefitOfCreditorsinfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = fetchByUUID_G(
				uuid, groupId);

		if (osiServicesGeneralBenefitOfCreditorsinfo == null) {
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

			throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
				sb.toString());
		}

		return osiServicesGeneralBenefitOfCreditorsinfo;
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUUID_G(
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

		if (result instanceof OsiServicesGeneralBenefitOfCreditorsinfo) {
			OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo =
					(OsiServicesGeneralBenefitOfCreditorsinfo)result;

			if (!Objects.equals(
					uuid, osiServicesGeneralBenefitOfCreditorsinfo.getUuid()) ||
				(groupId !=
					osiServicesGeneralBenefitOfCreditorsinfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(
				_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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

				List<OsiServicesGeneralBenefitOfCreditorsinfo> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo = list.get(0);

					result = osiServicesGeneralBenefitOfCreditorsinfo;

					cacheResult(osiServicesGeneralBenefitOfCreditorsinfo);
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
			return (OsiServicesGeneralBenefitOfCreditorsinfo)result;
		}
	}

	/**
	 * Removes the osi services general benefit of creditorsinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services general benefit of creditorsinfo that was removed
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = findByUUID_G(
				uuid, groupId);

		return remove(osiServicesGeneralBenefitOfCreditorsinfo);
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
		"osiServicesGeneralBenefitOfCreditorsinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesGeneralBenefitOfCreditorsinfo.uuid IS NULL OR osiServicesGeneralBenefitOfCreditorsinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesGeneralBenefitOfCreditorsinfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator,
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

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesGeneralBenefitOfCreditorsinfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo : list) {

					if (!uuid.equals(
							osiServicesGeneralBenefitOfCreditorsinfo.
								getUuid()) ||
						(companyId !=
							osiServicesGeneralBenefitOfCreditorsinfo.
								getCompanyId())) {

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

			sb.append(
				_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
				sb.append(
					OsiServicesGeneralBenefitOfCreditorsinfoModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<OsiServicesGeneralBenefitOfCreditorsinfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (osiServicesGeneralBenefitOfCreditorsinfo != null) {
			return osiServicesGeneralBenefitOfCreditorsinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (osiServicesGeneralBenefitOfCreditorsinfo != null) {
			return osiServicesGeneralBenefitOfCreditorsinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services general benefit of creditorsinfos before and after the current osi services general benefit of creditorsinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiBOCInsoId the primary key of the current osi services general benefit of creditorsinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo[] findByUuid_C_PrevAndNext(
			long osiBOCInsoId, String uuid, long companyId,
			OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
				orderByComparator)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = findByPrimaryKey(
				osiBOCInsoId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesGeneralBenefitOfCreditorsinfo[] array =
				new OsiServicesGeneralBenefitOfCreditorsinfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesGeneralBenefitOfCreditorsinfo, uuid,
				companyId, orderByComparator, true);

			array[1] = osiServicesGeneralBenefitOfCreditorsinfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesGeneralBenefitOfCreditorsinfo, uuid,
				companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiServicesGeneralBenefitOfCreditorsinfo getByUuid_C_PrevAndNext(
		Session session,
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo,
		String uuid, long companyId,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
			sb.append(
				OsiServicesGeneralBenefitOfCreditorsinfoModelImpl.
					ORDER_BY_JPQL);
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
						osiServicesGeneralBenefitOfCreditorsinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(osiServicesGeneralBenefitOfCreditorsinfo);
		}
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
		"osiServicesGeneralBenefitOfCreditorsinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesGeneralBenefitOfCreditorsinfo.uuid IS NULL OR osiServicesGeneralBenefitOfCreditorsinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesGeneralBenefitOfCreditorsinfo.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo =
				fetchBygetOsiServicesById(osiServicesApplicationId);

		if (osiServicesGeneralBenefitOfCreditorsinfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
				sb.toString());
		}

		return osiServicesGeneralBenefitOfCreditorsinfo;
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services general benefit of creditorsinfo, or <code>null</code> if a matching osi services general benefit of creditorsinfo could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchBygetOsiServicesById(
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

		if (result instanceof OsiServicesGeneralBenefitOfCreditorsinfo) {
			OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo =
					(OsiServicesGeneralBenefitOfCreditorsinfo)result;

			if (osiServicesApplicationId !=
					osiServicesGeneralBenefitOfCreditorsinfo.
						getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesGeneralBenefitOfCreditorsinfo> list =
					query.list();

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
								"OsiServicesGeneralBenefitOfCreditorsinfoPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesGeneralBenefitOfCreditorsinfo
						osiServicesGeneralBenefitOfCreditorsinfo = list.get(0);

					result = osiServicesGeneralBenefitOfCreditorsinfo;

					cacheResult(osiServicesGeneralBenefitOfCreditorsinfo);
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
			return (OsiServicesGeneralBenefitOfCreditorsinfo)result;
		}
	}

	/**
	 * Removes the osi services general benefit of creditorsinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services general benefit of creditorsinfo that was removed
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = findBygetOsiServicesById(
				osiServicesApplicationId);

		return remove(osiServicesGeneralBenefitOfCreditorsinfo);
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services general benefit of creditorsinfos
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE);

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
			"osiServicesGeneralBenefitOfCreditorsinfo.osiServicesApplicationId = ?";

	public OsiServicesGeneralBenefitOfCreditorsinfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesGeneralBenefitOfCreditorsinfo.class);

		setModelImplClass(OsiServicesGeneralBenefitOfCreditorsinfoImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesGeneralBenefitOfCreditorsinfoTable.INSTANCE);
	}

	/**
	 * Caches the osi services general benefit of creditorsinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfo the osi services general benefit of creditorsinfo
	 */
	@Override
	public void cacheResult(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo) {

		entityCache.putResult(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
			osiServicesGeneralBenefitOfCreditorsinfo.getPrimaryKey(),
			osiServicesGeneralBenefitOfCreditorsinfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesGeneralBenefitOfCreditorsinfo.getUuid(),
				osiServicesGeneralBenefitOfCreditorsinfo.getGroupId()
			},
			osiServicesGeneralBenefitOfCreditorsinfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {
				osiServicesGeneralBenefitOfCreditorsinfo.
					getOsiServicesApplicationId()
			},
			osiServicesGeneralBenefitOfCreditorsinfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services general benefit of creditorsinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesGeneralBenefitOfCreditorsinfos the osi services general benefit of creditorsinfos
	 */
	@Override
	public void cacheResult(
		List<OsiServicesGeneralBenefitOfCreditorsinfo>
			osiServicesGeneralBenefitOfCreditorsinfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesGeneralBenefitOfCreditorsinfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo :
					osiServicesGeneralBenefitOfCreditorsinfos) {

			if (entityCache.getResult(
					OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
					osiServicesGeneralBenefitOfCreditorsinfo.getPrimaryKey()) ==
						null) {

				cacheResult(osiServicesGeneralBenefitOfCreditorsinfo);
			}
		}
	}

	/**
	 * Clears the cache for all osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class);

		finderCache.clearCache(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class);
	}

	/**
	 * Clears the cache for the osi services general benefit of creditorsinfo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo) {

		entityCache.removeResult(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
			osiServicesGeneralBenefitOfCreditorsinfo);
	}

	@Override
	public void clearCache(
		List<OsiServicesGeneralBenefitOfCreditorsinfo>
			osiServicesGeneralBenefitOfCreditorsinfos) {

		for (OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo :
					osiServicesGeneralBenefitOfCreditorsinfos) {

			entityCache.removeResult(
				OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
				osiServicesGeneralBenefitOfCreditorsinfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesGeneralBenefitOfCreditorsinfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesGeneralBenefitOfCreditorsinfoModelImpl
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl) {

		Object[] args = new Object[] {
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl.getUuid(),
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl);

		args = new Object[] {
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl.
				getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl);
	}

	/**
	 * Creates a new osi services general benefit of creditorsinfo with the primary key. Does not add the osi services general benefit of creditorsinfo to the database.
	 *
	 * @param osiBOCInsoId the primary key for the new osi services general benefit of creditorsinfo
	 * @return the new osi services general benefit of creditorsinfo
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo create(long osiBOCInsoId) {
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo =
				new OsiServicesGeneralBenefitOfCreditorsinfoImpl();

		osiServicesGeneralBenefitOfCreditorsinfo.setNew(true);
		osiServicesGeneralBenefitOfCreditorsinfo.setPrimaryKey(osiBOCInsoId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesGeneralBenefitOfCreditorsinfo.setUuid(uuid);

		osiServicesGeneralBenefitOfCreditorsinfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServicesGeneralBenefitOfCreditorsinfo;
	}

	/**
	 * Removes the osi services general benefit of creditorsinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo remove(long osiBOCInsoId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		return remove((Serializable)osiBOCInsoId);
	}

	/**
	 * Removes the osi services general benefit of creditorsinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo that was removed
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo remove(
			Serializable primaryKey)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo =
					(OsiServicesGeneralBenefitOfCreditorsinfo)session.get(
						OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
						primaryKey);

			if (osiServicesGeneralBenefitOfCreditorsinfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesGeneralBenefitOfCreditorsinfo);
		}
		catch (NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException
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
	protected OsiServicesGeneralBenefitOfCreditorsinfo removeImpl(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesGeneralBenefitOfCreditorsinfo)) {
				osiServicesGeneralBenefitOfCreditorsinfo =
					(OsiServicesGeneralBenefitOfCreditorsinfo)session.get(
						OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
						osiServicesGeneralBenefitOfCreditorsinfo.
							getPrimaryKeyObj());
			}

			if (osiServicesGeneralBenefitOfCreditorsinfo != null) {
				session.delete(osiServicesGeneralBenefitOfCreditorsinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesGeneralBenefitOfCreditorsinfo != null) {
			clearCache(osiServicesGeneralBenefitOfCreditorsinfo);
		}

		return osiServicesGeneralBenefitOfCreditorsinfo;
	}

	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo updateImpl(
		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo) {

		boolean isNew = osiServicesGeneralBenefitOfCreditorsinfo.isNew();

		if (!(osiServicesGeneralBenefitOfCreditorsinfo instanceof
				OsiServicesGeneralBenefitOfCreditorsinfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiServicesGeneralBenefitOfCreditorsinfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesGeneralBenefitOfCreditorsinfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesGeneralBenefitOfCreditorsinfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesGeneralBenefitOfCreditorsinfo implementation " +
					osiServicesGeneralBenefitOfCreditorsinfo.getClass());
		}

		OsiServicesGeneralBenefitOfCreditorsinfoModelImpl
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl =
				(OsiServicesGeneralBenefitOfCreditorsinfoModelImpl)
					osiServicesGeneralBenefitOfCreditorsinfo;

		if (Validator.isNull(
				osiServicesGeneralBenefitOfCreditorsinfo.getUuid())) {

			String uuid = PortalUUIDUtil.generate();

			osiServicesGeneralBenefitOfCreditorsinfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(osiServicesGeneralBenefitOfCreditorsinfo.getCreateDate() ==
				null)) {

			if (serviceContext == null) {
				osiServicesGeneralBenefitOfCreditorsinfo.setCreateDate(date);
			}
			else {
				osiServicesGeneralBenefitOfCreditorsinfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesGeneralBenefitOfCreditorsinfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				osiServicesGeneralBenefitOfCreditorsinfo.setModifiedDate(date);
			}
			else {
				osiServicesGeneralBenefitOfCreditorsinfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesGeneralBenefitOfCreditorsinfo);
			}
			else {
				osiServicesGeneralBenefitOfCreditorsinfo =
					(OsiServicesGeneralBenefitOfCreditorsinfo)session.merge(
						osiServicesGeneralBenefitOfCreditorsinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class,
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl, false, true);

		cacheUniqueFindersCache(
			osiServicesGeneralBenefitOfCreditorsinfoModelImpl);

		if (isNew) {
			osiServicesGeneralBenefitOfCreditorsinfo.setNew(false);
		}

		osiServicesGeneralBenefitOfCreditorsinfo.resetOriginalValues();

		return osiServicesGeneralBenefitOfCreditorsinfo;
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		OsiServicesGeneralBenefitOfCreditorsinfo
			osiServicesGeneralBenefitOfCreditorsinfo = fetchByPrimaryKey(
				primaryKey);

		if (osiServicesGeneralBenefitOfCreditorsinfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesGeneralBenefitOfCreditorsinfo;
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key or throws a <code>NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException</code> if it could not be found.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo
	 * @throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo findByPrimaryKey(
			long osiBOCInsoId)
		throws NoSuchOsiServicesGeneralBenefitOfCreditorsinfoException {

		return findByPrimaryKey((Serializable)osiBOCInsoId);
	}

	/**
	 * Returns the osi services general benefit of creditorsinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiBOCInsoId the primary key of the osi services general benefit of creditorsinfo
	 * @return the osi services general benefit of creditorsinfo, or <code>null</code> if a osi services general benefit of creditorsinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfo fetchByPrimaryKey(
		long osiBOCInsoId) {

		return fetchByPrimaryKey((Serializable)osiBOCInsoId);
	}

	/**
	 * Returns all the osi services general benefit of creditorsinfos.
	 *
	 * @return the osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @return the range of osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services general benefit of creditorsinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesGeneralBenefitOfCreditorsinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services general benefit of creditorsinfos
	 * @param end the upper bound of the range of osi services general benefit of creditorsinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services general benefit of creditorsinfos
	 */
	@Override
	public List<OsiServicesGeneralBenefitOfCreditorsinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesGeneralBenefitOfCreditorsinfo>
			orderByComparator,
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

		List<OsiServicesGeneralBenefitOfCreditorsinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesGeneralBenefitOfCreditorsinfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO;

				sql = sql.concat(
					OsiServicesGeneralBenefitOfCreditorsinfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<OsiServicesGeneralBenefitOfCreditorsinfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the osi services general benefit of creditorsinfos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesGeneralBenefitOfCreditorsinfo
				osiServicesGeneralBenefitOfCreditorsinfo : findAll()) {

			remove(osiServicesGeneralBenefitOfCreditorsinfo);
		}
	}

	/**
	 * Returns the number of osi services general benefit of creditorsinfos.
	 *
	 * @return the number of osi services general benefit of creditorsinfos
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
					_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO);

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
		return "osiBOCInsoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesGeneralBenefitOfCreditorsinfoModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services general benefit of creditorsinfo persistence.
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

		OsiServicesGeneralBenefitOfCreditorsinfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesGeneralBenefitOfCreditorsinfoUtil.setPersistence(null);

		entityCache.removeCache(
			OsiServicesGeneralBenefitOfCreditorsinfoImpl.class.getName());
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

	private static final String
		_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO =
			"SELECT osiServicesGeneralBenefitOfCreditorsinfo FROM OsiServicesGeneralBenefitOfCreditorsinfo osiServicesGeneralBenefitOfCreditorsinfo";

	private static final String
		_SQL_SELECT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE =
			"SELECT osiServicesGeneralBenefitOfCreditorsinfo FROM OsiServicesGeneralBenefitOfCreditorsinfo osiServicesGeneralBenefitOfCreditorsinfo WHERE ";

	private static final String
		_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO =
			"SELECT COUNT(osiServicesGeneralBenefitOfCreditorsinfo) FROM OsiServicesGeneralBenefitOfCreditorsinfo osiServicesGeneralBenefitOfCreditorsinfo";

	private static final String
		_SQL_COUNT_OSISERVICESGENERALBENEFITOFCREDITORSINFO_WHERE =
			"SELECT COUNT(osiServicesGeneralBenefitOfCreditorsinfo) FROM OsiServicesGeneralBenefitOfCreditorsinfo osiServicesGeneralBenefitOfCreditorsinfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesGeneralBenefitOfCreditorsinfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesGeneralBenefitOfCreditorsinfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesGeneralBenefitOfCreditorsinfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesGeneralBenefitOfCreditorsinfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}