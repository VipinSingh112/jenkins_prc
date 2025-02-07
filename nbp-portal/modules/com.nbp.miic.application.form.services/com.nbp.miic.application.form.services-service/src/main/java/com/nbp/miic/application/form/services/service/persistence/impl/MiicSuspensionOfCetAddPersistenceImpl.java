/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicSuspensionOfCetAddException;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAddTable;
import com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddImpl;
import com.nbp.miic.application.form.services.model.impl.MiicSuspensionOfCetAddModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetAddUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

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
 * The persistence implementation for the miic suspension of cet add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicSuspensionOfCetAddPersistence.class)
public class MiicSuspensionOfCetAddPersistenceImpl
	extends BasePersistenceImpl<MiicSuspensionOfCetAdd>
	implements MiicSuspensionOfCetAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicSuspensionOfCetAddUtil</code> to access the miic suspension of cet add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicSuspensionOfCetAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMiicById;
	private FinderPath _finderPathWithoutPaginationFindBygetMiicById;
	private FinderPath _finderPathCountBygetMiicById;

	/**
	 * Returns all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId) {

		return findBygetMiicById(
			miicApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of matching miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end) {

		return findBygetMiicById(miicApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return findBygetMiicById(
			miicApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMiicById;
				finderArgs = new Object[] {miicApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiicById;
			finderArgs = new Object[] {
				miicApplicationId, start, end, orderByComparator
			};
		}

		List<MiicSuspensionOfCetAdd> list = null;

		if (useFinderCache) {
			list = (List<MiicSuspensionOfCetAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicSuspensionOfCetAdd miicSuspensionOfCetAdd : list) {
					if (miicApplicationId !=
							miicSuspensionOfCetAdd.getMiicApplicationId()) {

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

			sb.append(_SQL_SELECT_MIICSUSPENSIONOFCETADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicSuspensionOfCetAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				list = (List<MiicSuspensionOfCetAdd>)QueryUtil.list(
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
	 * Returns the first miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a matching miic suspension of cet add could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd findBygetMiicById_First(
			long miicApplicationId,
			OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator)
		throws NoSuchMiicSuspensionOfCetAddException {

		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd =
			fetchBygetMiicById_First(miicApplicationId, orderByComparator);

		if (miicSuspensionOfCetAdd != null) {
			return miicSuspensionOfCetAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miicApplicationId=");
		sb.append(miicApplicationId);

		sb.append("}");

		throw new NoSuchMiicSuspensionOfCetAddException(sb.toString());
	}

	/**
	 * Returns the first miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic suspension of cet add, or <code>null</code> if a matching miic suspension of cet add could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd fetchBygetMiicById_First(
		long miicApplicationId,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		List<MiicSuspensionOfCetAdd> list = findBygetMiicById(
			miicApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a matching miic suspension of cet add could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd findBygetMiicById_Last(
			long miicApplicationId,
			OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator)
		throws NoSuchMiicSuspensionOfCetAddException {

		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd = fetchBygetMiicById_Last(
			miicApplicationId, orderByComparator);

		if (miicSuspensionOfCetAdd != null) {
			return miicSuspensionOfCetAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("miicApplicationId=");
		sb.append(miicApplicationId);

		sb.append("}");

		throw new NoSuchMiicSuspensionOfCetAddException(sb.toString());
	}

	/**
	 * Returns the last miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic suspension of cet add, or <code>null</code> if a matching miic suspension of cet add could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		int count = countBygetMiicById(miicApplicationId);

		if (count == 0) {
			return null;
		}

		List<MiicSuspensionOfCetAdd> list = findBygetMiicById(
			miicApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic suspension of cet adds before and after the current miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the current miic suspension of cet add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd[] findBygetMiicById_PrevAndNext(
			long miicSuspensionOfCetAddId, long miicApplicationId,
			OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator)
		throws NoSuchMiicSuspensionOfCetAddException {

		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd = findByPrimaryKey(
			miicSuspensionOfCetAddId);

		Session session = null;

		try {
			session = openSession();

			MiicSuspensionOfCetAdd[] array = new MiicSuspensionOfCetAddImpl[3];

			array[0] = getBygetMiicById_PrevAndNext(
				session, miicSuspensionOfCetAdd, miicApplicationId,
				orderByComparator, true);

			array[1] = miicSuspensionOfCetAdd;

			array[2] = getBygetMiicById_PrevAndNext(
				session, miicSuspensionOfCetAdd, miicApplicationId,
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

	protected MiicSuspensionOfCetAdd getBygetMiicById_PrevAndNext(
		Session session, MiicSuspensionOfCetAdd miicSuspensionOfCetAdd,
		long miicApplicationId,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICSUSPENSIONOFCETADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

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
			sb.append(MiicSuspensionOfCetAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(miicApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						miicSuspensionOfCetAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicSuspensionOfCetAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic suspension of cet adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	@Override
	public void removeBygetMiicById(long miicApplicationId) {
		for (MiicSuspensionOfCetAdd miicSuspensionOfCetAdd :
				findBygetMiicById(
					miicApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicSuspensionOfCetAdd);
		}
	}

	/**
	 * Returns the number of miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic suspension of cet adds
	 */
	@Override
	public int countBygetMiicById(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiicById;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICSUSPENSIONOFCETADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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

	private static final String _FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2 =
		"miicSuspensionOfCetAdd.miicApplicationId = ?";

	public MiicSuspensionOfCetAddPersistenceImpl() {
		setModelClass(MiicSuspensionOfCetAdd.class);

		setModelImplClass(MiicSuspensionOfCetAddImpl.class);
		setModelPKClass(long.class);

		setTable(MiicSuspensionOfCetAddTable.INSTANCE);
	}

	/**
	 * Caches the miic suspension of cet add in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCetAdd the miic suspension of cet add
	 */
	@Override
	public void cacheResult(MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {
		entityCache.putResult(
			MiicSuspensionOfCetAddImpl.class,
			miicSuspensionOfCetAdd.getPrimaryKey(), miicSuspensionOfCetAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic suspension of cet adds in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCetAdds the miic suspension of cet adds
	 */
	@Override
	public void cacheResult(
		List<MiicSuspensionOfCetAdd> miicSuspensionOfCetAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicSuspensionOfCetAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicSuspensionOfCetAdd miicSuspensionOfCetAdd :
				miicSuspensionOfCetAdds) {

			if (entityCache.getResult(
					MiicSuspensionOfCetAddImpl.class,
					miicSuspensionOfCetAdd.getPrimaryKey()) == null) {

				cacheResult(miicSuspensionOfCetAdd);
			}
		}
	}

	/**
	 * Clears the cache for all miic suspension of cet adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicSuspensionOfCetAddImpl.class);

		finderCache.clearCache(MiicSuspensionOfCetAddImpl.class);
	}

	/**
	 * Clears the cache for the miic suspension of cet add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {
		entityCache.removeResult(
			MiicSuspensionOfCetAddImpl.class, miicSuspensionOfCetAdd);
	}

	@Override
	public void clearCache(
		List<MiicSuspensionOfCetAdd> miicSuspensionOfCetAdds) {

		for (MiicSuspensionOfCetAdd miicSuspensionOfCetAdd :
				miicSuspensionOfCetAdds) {

			entityCache.removeResult(
				MiicSuspensionOfCetAddImpl.class, miicSuspensionOfCetAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicSuspensionOfCetAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicSuspensionOfCetAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new miic suspension of cet add with the primary key. Does not add the miic suspension of cet add to the database.
	 *
	 * @param miicSuspensionOfCetAddId the primary key for the new miic suspension of cet add
	 * @return the new miic suspension of cet add
	 */
	@Override
	public MiicSuspensionOfCetAdd create(long miicSuspensionOfCetAddId) {
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd =
			new MiicSuspensionOfCetAddImpl();

		miicSuspensionOfCetAdd.setNew(true);
		miicSuspensionOfCetAdd.setPrimaryKey(miicSuspensionOfCetAddId);

		miicSuspensionOfCetAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicSuspensionOfCetAdd;
	}

	/**
	 * Removes the miic suspension of cet add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add that was removed
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd remove(long miicSuspensionOfCetAddId)
		throws NoSuchMiicSuspensionOfCetAddException {

		return remove((Serializable)miicSuspensionOfCetAddId);
	}

	/**
	 * Removes the miic suspension of cet add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add that was removed
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd remove(Serializable primaryKey)
		throws NoSuchMiicSuspensionOfCetAddException {

		Session session = null;

		try {
			session = openSession();

			MiicSuspensionOfCetAdd miicSuspensionOfCetAdd =
				(MiicSuspensionOfCetAdd)session.get(
					MiicSuspensionOfCetAddImpl.class, primaryKey);

			if (miicSuspensionOfCetAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicSuspensionOfCetAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicSuspensionOfCetAdd);
		}
		catch (NoSuchMiicSuspensionOfCetAddException noSuchEntityException) {
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
	protected MiicSuspensionOfCetAdd removeImpl(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicSuspensionOfCetAdd)) {
				miicSuspensionOfCetAdd = (MiicSuspensionOfCetAdd)session.get(
					MiicSuspensionOfCetAddImpl.class,
					miicSuspensionOfCetAdd.getPrimaryKeyObj());
			}

			if (miicSuspensionOfCetAdd != null) {
				session.delete(miicSuspensionOfCetAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicSuspensionOfCetAdd != null) {
			clearCache(miicSuspensionOfCetAdd);
		}

		return miicSuspensionOfCetAdd;
	}

	@Override
	public MiicSuspensionOfCetAdd updateImpl(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		boolean isNew = miicSuspensionOfCetAdd.isNew();

		if (!(miicSuspensionOfCetAdd instanceof
				MiicSuspensionOfCetAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicSuspensionOfCetAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicSuspensionOfCetAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicSuspensionOfCetAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicSuspensionOfCetAdd implementation " +
					miicSuspensionOfCetAdd.getClass());
		}

		MiicSuspensionOfCetAddModelImpl miicSuspensionOfCetAddModelImpl =
			(MiicSuspensionOfCetAddModelImpl)miicSuspensionOfCetAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicSuspensionOfCetAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicSuspensionOfCetAdd.setCreateDate(date);
			}
			else {
				miicSuspensionOfCetAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicSuspensionOfCetAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicSuspensionOfCetAdd.setModifiedDate(date);
			}
			else {
				miicSuspensionOfCetAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicSuspensionOfCetAdd);
			}
			else {
				miicSuspensionOfCetAdd = (MiicSuspensionOfCetAdd)session.merge(
					miicSuspensionOfCetAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicSuspensionOfCetAddImpl.class, miicSuspensionOfCetAddModelImpl,
			false, true);

		if (isNew) {
			miicSuspensionOfCetAdd.setNew(false);
		}

		miicSuspensionOfCetAdd.resetOriginalValues();

		return miicSuspensionOfCetAdd;
	}

	/**
	 * Returns the miic suspension of cet add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicSuspensionOfCetAddException {

		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd = fetchByPrimaryKey(
			primaryKey);

		if (miicSuspensionOfCetAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicSuspensionOfCetAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicSuspensionOfCetAdd;
	}

	/**
	 * Returns the miic suspension of cet add with the primary key or throws a <code>NoSuchMiicSuspensionOfCetAddException</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd findByPrimaryKey(
			long miicSuspensionOfCetAddId)
		throws NoSuchMiicSuspensionOfCetAddException {

		return findByPrimaryKey((Serializable)miicSuspensionOfCetAddId);
	}

	/**
	 * Returns the miic suspension of cet add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add, or <code>null</code> if a miic suspension of cet add with the primary key could not be found
	 */
	@Override
	public MiicSuspensionOfCetAdd fetchByPrimaryKey(
		long miicSuspensionOfCetAddId) {

		return fetchByPrimaryKey((Serializable)miicSuspensionOfCetAddId);
	}

	/**
	 * Returns all the miic suspension of cet adds.
	 *
	 * @return the miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic suspension of cet adds
	 */
	@Override
	public List<MiicSuspensionOfCetAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator,
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

		List<MiicSuspensionOfCetAdd> list = null;

		if (useFinderCache) {
			list = (List<MiicSuspensionOfCetAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICSUSPENSIONOFCETADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICSUSPENSIONOFCETADD;

				sql = sql.concat(MiicSuspensionOfCetAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicSuspensionOfCetAdd>)QueryUtil.list(
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
	 * Removes all the miic suspension of cet adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicSuspensionOfCetAdd miicSuspensionOfCetAdd : findAll()) {
			remove(miicSuspensionOfCetAdd);
		}
	}

	/**
	 * Returns the number of miic suspension of cet adds.
	 *
	 * @return the number of miic suspension of cet adds
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
					_SQL_COUNT_MIICSUSPENSIONOFCETADD);

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
		return "miicSuspensionOfCetAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICSUSPENSIONOFCETADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicSuspensionOfCetAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic suspension of cet add persistence.
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

		_finderPathWithPaginationFindBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiicById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"miicApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMiicById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiicById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		MiicSuspensionOfCetAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicSuspensionOfCetAddUtil.setPersistence(null);

		entityCache.removeCache(MiicSuspensionOfCetAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICSUSPENSIONOFCETADD =
		"SELECT miicSuspensionOfCetAdd FROM MiicSuspensionOfCetAdd miicSuspensionOfCetAdd";

	private static final String _SQL_SELECT_MIICSUSPENSIONOFCETADD_WHERE =
		"SELECT miicSuspensionOfCetAdd FROM MiicSuspensionOfCetAdd miicSuspensionOfCetAdd WHERE ";

	private static final String _SQL_COUNT_MIICSUSPENSIONOFCETADD =
		"SELECT COUNT(miicSuspensionOfCetAdd) FROM MiicSuspensionOfCetAdd miicSuspensionOfCetAdd";

	private static final String _SQL_COUNT_MIICSUSPENSIONOFCETADD_WHERE =
		"SELECT COUNT(miicSuspensionOfCetAdd) FROM MiicSuspensionOfCetAdd miicSuspensionOfCetAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicSuspensionOfCetAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicSuspensionOfCetAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicSuspensionOfCetAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicSuspensionOfCetAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}