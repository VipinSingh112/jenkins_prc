/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuEquipmentAddException;
import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;
import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAddTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentAddUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the manu equipment add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManuEquipmentAddPersistence.class)
public class ManuEquipmentAddPersistenceImpl
	extends BasePersistenceImpl<ManuEquipmentAdd>
	implements ManuEquipmentAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuEquipmentAddUtil</code> to access the manu equipment add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuEquipmentAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMA_EAF;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_EAF;
	private FinderPath _finderPathCountBygetMA_EAF;

	/**
	 * Returns all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId) {

		return findBygetMA_EAF(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_EAF(manufacturingApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return findBygetMA_EAF(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_EAF;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_EAF;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ManuEquipmentAdd> list = null;

		if (useFinderCache) {
			list = (List<ManuEquipmentAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuEquipmentAdd manuEquipmentAdd : list) {
					if (manufacturingApplicationId !=
							manuEquipmentAdd.getManufacturingApplicationId()) {

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

			sb.append(_SQL_SELECT_MANUEQUIPMENTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_EAF_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuEquipmentAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ManuEquipmentAdd>)QueryUtil.list(
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
	 * Returns the first manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd findBygetMA_EAF_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = fetchBygetMA_EAF_First(
			manufacturingApplicationId, orderByComparator);

		if (manuEquipmentAdd != null) {
			return manuEquipmentAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuEquipmentAddException(sb.toString());
	}

	/**
	 * Returns the first manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd fetchBygetMA_EAF_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		List<ManuEquipmentAdd> list = findBygetMA_EAF(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd findBygetMA_EAF_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = fetchBygetMA_EAF_Last(
			manufacturingApplicationId, orderByComparator);

		if (manuEquipmentAdd != null) {
			return manuEquipmentAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchManuEquipmentAddException(sb.toString());
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd fetchBygetMA_EAF_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		int count = countBygetMA_EAF(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ManuEquipmentAdd> list = findBygetMA_EAF(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu equipment adds before and after the current manu equipment add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuEquipmentAddId the primary key of the current manu equipment add
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd[] findBygetMA_EAF_PrevAndNext(
			long manuEquipmentAddId, long manufacturingApplicationId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = findByPrimaryKey(
			manuEquipmentAddId);

		Session session = null;

		try {
			session = openSession();

			ManuEquipmentAdd[] array = new ManuEquipmentAddImpl[3];

			array[0] = getBygetMA_EAF_PrevAndNext(
				session, manuEquipmentAdd, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = manuEquipmentAdd;

			array[2] = getBygetMA_EAF_PrevAndNext(
				session, manuEquipmentAdd, manufacturingApplicationId,
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

	protected ManuEquipmentAdd getBygetMA_EAF_PrevAndNext(
		Session session, ManuEquipmentAdd manuEquipmentAdd,
		long manufacturingApplicationId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUEQUIPMENTADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_EAF_MANUFACTURINGAPPLICATIONID_2);

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
			sb.append(ManuEquipmentAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuEquipmentAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuEquipmentAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu equipment adds where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_EAF(long manufacturingApplicationId) {
		for (ManuEquipmentAdd manuEquipmentAdd :
				findBygetMA_EAF(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manuEquipmentAdd);
		}
	}

	/**
	 * Returns the number of manu equipment adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu equipment adds
	 */
	@Override
	public int countBygetMA_EAF(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_EAF;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUEQUIPMENTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_EAF_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMA_EAF_MANUFACTURINGAPPLICATIONID_2 =
			"manuEquipmentAdd.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_EAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_EAI;
	private FinderPath _finderPathCountBygetMA_EAI;

	/**
	 * Returns all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @return the matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAI(long manuEquipmentId) {
		return findBygetMA_EAI(
			manuEquipmentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end) {

		return findBygetMA_EAI(manuEquipmentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return findBygetMA_EAI(
			manuEquipmentId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findBygetMA_EAI(
		long manuEquipmentId, int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_EAI;
				finderArgs = new Object[] {manuEquipmentId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_EAI;
			finderArgs = new Object[] {
				manuEquipmentId, start, end, orderByComparator
			};
		}

		List<ManuEquipmentAdd> list = null;

		if (useFinderCache) {
			list = (List<ManuEquipmentAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManuEquipmentAdd manuEquipmentAdd : list) {
					if (manuEquipmentId !=
							manuEquipmentAdd.getManuEquipmentId()) {

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

			sb.append(_SQL_SELECT_MANUEQUIPMENTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_EAI_MANUEQUIPMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ManuEquipmentAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manuEquipmentId);

				list = (List<ManuEquipmentAdd>)QueryUtil.list(
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
	 * Returns the first manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd findBygetMA_EAI_First(
			long manuEquipmentId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = fetchBygetMA_EAI_First(
			manuEquipmentId, orderByComparator);

		if (manuEquipmentAdd != null) {
			return manuEquipmentAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manuEquipmentId=");
		sb.append(manuEquipmentId);

		sb.append("}");

		throw new NoSuchManuEquipmentAddException(sb.toString());
	}

	/**
	 * Returns the first manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd fetchBygetMA_EAI_First(
		long manuEquipmentId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		List<ManuEquipmentAdd> list = findBygetMA_EAI(
			manuEquipmentId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd findBygetMA_EAI_Last(
			long manuEquipmentId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = fetchBygetMA_EAI_Last(
			manuEquipmentId, orderByComparator);

		if (manuEquipmentAdd != null) {
			return manuEquipmentAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manuEquipmentId=");
		sb.append(manuEquipmentId);

		sb.append("}");

		throw new NoSuchManuEquipmentAddException(sb.toString());
	}

	/**
	 * Returns the last manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu equipment add, or <code>null</code> if a matching manu equipment add could not be found
	 */
	@Override
	public ManuEquipmentAdd fetchBygetMA_EAI_Last(
		long manuEquipmentId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		int count = countBygetMA_EAI(manuEquipmentId);

		if (count == 0) {
			return null;
		}

		List<ManuEquipmentAdd> list = findBygetMA_EAI(
			manuEquipmentId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manu equipment adds before and after the current manu equipment add in the ordered set where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentAddId the primary key of the current manu equipment add
	 * @param manuEquipmentId the manu equipment ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd[] findBygetMA_EAI_PrevAndNext(
			long manuEquipmentAddId, long manuEquipmentId,
			OrderByComparator<ManuEquipmentAdd> orderByComparator)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = findByPrimaryKey(
			manuEquipmentAddId);

		Session session = null;

		try {
			session = openSession();

			ManuEquipmentAdd[] array = new ManuEquipmentAddImpl[3];

			array[0] = getBygetMA_EAI_PrevAndNext(
				session, manuEquipmentAdd, manuEquipmentId, orderByComparator,
				true);

			array[1] = manuEquipmentAdd;

			array[2] = getBygetMA_EAI_PrevAndNext(
				session, manuEquipmentAdd, manuEquipmentId, orderByComparator,
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

	protected ManuEquipmentAdd getBygetMA_EAI_PrevAndNext(
		Session session, ManuEquipmentAdd manuEquipmentAdd,
		long manuEquipmentId,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUEQUIPMENTADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_EAI_MANUEQUIPMENTID_2);

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
			sb.append(ManuEquipmentAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manuEquipmentId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						manuEquipmentAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManuEquipmentAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manu equipment adds where manuEquipmentId = &#63; from the database.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 */
	@Override
	public void removeBygetMA_EAI(long manuEquipmentId) {
		for (ManuEquipmentAdd manuEquipmentAdd :
				findBygetMA_EAI(
					manuEquipmentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(manuEquipmentAdd);
		}
	}

	/**
	 * Returns the number of manu equipment adds where manuEquipmentId = &#63;.
	 *
	 * @param manuEquipmentId the manu equipment ID
	 * @return the number of matching manu equipment adds
	 */
	@Override
	public int countBygetMA_EAI(long manuEquipmentId) {
		FinderPath finderPath = _finderPathCountBygetMA_EAI;

		Object[] finderArgs = new Object[] {manuEquipmentId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUEQUIPMENTADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_EAI_MANUEQUIPMENTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manuEquipmentId);

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

	private static final String _FINDER_COLUMN_GETMA_EAI_MANUEQUIPMENTID_2 =
		"manuEquipmentAdd.manuEquipmentId = ?";

	public ManuEquipmentAddPersistenceImpl() {
		setModelClass(ManuEquipmentAdd.class);

		setModelImplClass(ManuEquipmentAddImpl.class);
		setModelPKClass(long.class);

		setTable(ManuEquipmentAddTable.INSTANCE);
	}

	/**
	 * Caches the manu equipment add in the entity cache if it is enabled.
	 *
	 * @param manuEquipmentAdd the manu equipment add
	 */
	@Override
	public void cacheResult(ManuEquipmentAdd manuEquipmentAdd) {
		entityCache.putResult(
			ManuEquipmentAddImpl.class, manuEquipmentAdd.getPrimaryKey(),
			manuEquipmentAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu equipment adds in the entity cache if it is enabled.
	 *
	 * @param manuEquipmentAdds the manu equipment adds
	 */
	@Override
	public void cacheResult(List<ManuEquipmentAdd> manuEquipmentAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuEquipmentAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuEquipmentAdd manuEquipmentAdd : manuEquipmentAdds) {
			if (entityCache.getResult(
					ManuEquipmentAddImpl.class,
					manuEquipmentAdd.getPrimaryKey()) == null) {

				cacheResult(manuEquipmentAdd);
			}
		}
	}

	/**
	 * Clears the cache for all manu equipment adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuEquipmentAddImpl.class);

		finderCache.clearCache(ManuEquipmentAddImpl.class);
	}

	/**
	 * Clears the cache for the manu equipment add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManuEquipmentAdd manuEquipmentAdd) {
		entityCache.removeResult(ManuEquipmentAddImpl.class, manuEquipmentAdd);
	}

	@Override
	public void clearCache(List<ManuEquipmentAdd> manuEquipmentAdds) {
		for (ManuEquipmentAdd manuEquipmentAdd : manuEquipmentAdds) {
			entityCache.removeResult(
				ManuEquipmentAddImpl.class, manuEquipmentAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuEquipmentAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ManuEquipmentAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new manu equipment add with the primary key. Does not add the manu equipment add to the database.
	 *
	 * @param manuEquipmentAddId the primary key for the new manu equipment add
	 * @return the new manu equipment add
	 */
	@Override
	public ManuEquipmentAdd create(long manuEquipmentAddId) {
		ManuEquipmentAdd manuEquipmentAdd = new ManuEquipmentAddImpl();

		manuEquipmentAdd.setNew(true);
		manuEquipmentAdd.setPrimaryKey(manuEquipmentAddId);

		manuEquipmentAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manuEquipmentAdd;
	}

	/**
	 * Removes the manu equipment add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add that was removed
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd remove(long manuEquipmentAddId)
		throws NoSuchManuEquipmentAddException {

		return remove((Serializable)manuEquipmentAddId);
	}

	/**
	 * Removes the manu equipment add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu equipment add
	 * @return the manu equipment add that was removed
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd remove(Serializable primaryKey)
		throws NoSuchManuEquipmentAddException {

		Session session = null;

		try {
			session = openSession();

			ManuEquipmentAdd manuEquipmentAdd = (ManuEquipmentAdd)session.get(
				ManuEquipmentAddImpl.class, primaryKey);

			if (manuEquipmentAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuEquipmentAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuEquipmentAdd);
		}
		catch (NoSuchManuEquipmentAddException noSuchEntityException) {
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
	protected ManuEquipmentAdd removeImpl(ManuEquipmentAdd manuEquipmentAdd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuEquipmentAdd)) {
				manuEquipmentAdd = (ManuEquipmentAdd)session.get(
					ManuEquipmentAddImpl.class,
					manuEquipmentAdd.getPrimaryKeyObj());
			}

			if (manuEquipmentAdd != null) {
				session.delete(manuEquipmentAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuEquipmentAdd != null) {
			clearCache(manuEquipmentAdd);
		}

		return manuEquipmentAdd;
	}

	@Override
	public ManuEquipmentAdd updateImpl(ManuEquipmentAdd manuEquipmentAdd) {
		boolean isNew = manuEquipmentAdd.isNew();

		if (!(manuEquipmentAdd instanceof ManuEquipmentAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuEquipmentAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuEquipmentAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuEquipmentAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuEquipmentAdd implementation " +
					manuEquipmentAdd.getClass());
		}

		ManuEquipmentAddModelImpl manuEquipmentAddModelImpl =
			(ManuEquipmentAddModelImpl)manuEquipmentAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuEquipmentAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuEquipmentAdd.setCreateDate(date);
			}
			else {
				manuEquipmentAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuEquipmentAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuEquipmentAdd.setModifiedDate(date);
			}
			else {
				manuEquipmentAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuEquipmentAdd);
			}
			else {
				manuEquipmentAdd = (ManuEquipmentAdd)session.merge(
					manuEquipmentAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuEquipmentAddImpl.class, manuEquipmentAddModelImpl, false, true);

		if (isNew) {
			manuEquipmentAdd.setNew(false);
		}

		manuEquipmentAdd.resetOriginalValues();

		return manuEquipmentAdd;
	}

	/**
	 * Returns the manu equipment add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu equipment add
	 * @return the manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuEquipmentAddException {

		ManuEquipmentAdd manuEquipmentAdd = fetchByPrimaryKey(primaryKey);

		if (manuEquipmentAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuEquipmentAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuEquipmentAdd;
	}

	/**
	 * Returns the manu equipment add with the primary key or throws a <code>NoSuchManuEquipmentAddException</code> if it could not be found.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add
	 * @throws NoSuchManuEquipmentAddException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd findByPrimaryKey(long manuEquipmentAddId)
		throws NoSuchManuEquipmentAddException {

		return findByPrimaryKey((Serializable)manuEquipmentAddId);
	}

	/**
	 * Returns the manu equipment add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add, or <code>null</code> if a manu equipment add with the primary key could not be found
	 */
	@Override
	public ManuEquipmentAdd fetchByPrimaryKey(long manuEquipmentAddId) {
		return fetchByPrimaryKey((Serializable)manuEquipmentAddId);
	}

	/**
	 * Returns all the manu equipment adds.
	 *
	 * @return the manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findAll(
		int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu equipment adds
	 */
	@Override
	public List<ManuEquipmentAdd> findAll(
		int start, int end,
		OrderByComparator<ManuEquipmentAdd> orderByComparator,
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

		List<ManuEquipmentAdd> list = null;

		if (useFinderCache) {
			list = (List<ManuEquipmentAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUEQUIPMENTADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUEQUIPMENTADD;

				sql = sql.concat(ManuEquipmentAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuEquipmentAdd>)QueryUtil.list(
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
	 * Removes all the manu equipment adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuEquipmentAdd manuEquipmentAdd : findAll()) {
			remove(manuEquipmentAdd);
		}
	}

	/**
	 * Returns the number of manu equipment adds.
	 *
	 * @return the number of manu equipment adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MANUEQUIPMENTADD);

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
		return "manuEquipmentAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUEQUIPMENTADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuEquipmentAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu equipment add persistence.
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

		_finderPathWithPaginationFindBygetMA_EAF = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_EAF",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_EAF = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_EAF",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_EAF = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_EAF",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_EAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_EAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manuEquipmentId"}, true);

		_finderPathWithoutPaginationFindBygetMA_EAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_EAI",
			new String[] {Long.class.getName()},
			new String[] {"manuEquipmentId"}, true);

		_finderPathCountBygetMA_EAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_EAI",
			new String[] {Long.class.getName()},
			new String[] {"manuEquipmentId"}, false);

		ManuEquipmentAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManuEquipmentAddUtil.setPersistence(null);

		entityCache.removeCache(ManuEquipmentAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUEQUIPMENTADD =
		"SELECT manuEquipmentAdd FROM ManuEquipmentAdd manuEquipmentAdd";

	private static final String _SQL_SELECT_MANUEQUIPMENTADD_WHERE =
		"SELECT manuEquipmentAdd FROM ManuEquipmentAdd manuEquipmentAdd WHERE ";

	private static final String _SQL_COUNT_MANUEQUIPMENTADD =
		"SELECT COUNT(manuEquipmentAdd) FROM ManuEquipmentAdd manuEquipmentAdd";

	private static final String _SQL_COUNT_MANUEQUIPMENTADD_WHERE =
		"SELECT COUNT(manuEquipmentAdd) FROM ManuEquipmentAdd manuEquipmentAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "manuEquipmentAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuEquipmentAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuEquipmentAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuEquipmentAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}