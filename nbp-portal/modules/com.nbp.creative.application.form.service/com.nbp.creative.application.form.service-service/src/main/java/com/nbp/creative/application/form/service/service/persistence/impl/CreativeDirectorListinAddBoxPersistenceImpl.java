/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeDirectorListinAddBoxException;
import com.nbp.creative.application.form.service.model.CreativeDirectorListinAddBox;
import com.nbp.creative.application.form.service.model.CreativeDirectorListinAddBoxTable;
import com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeDirectorListinAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeDirectorListinAddBoxUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative director listin add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeDirectorListinAddBoxPersistence.class)
public class CreativeDirectorListinAddBoxPersistenceImpl
	extends BasePersistenceImpl<CreativeDirectorListinAddBox>
	implements CreativeDirectorListinAddBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeDirectorListinAddBoxUtil</code> to access the creative director listin add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeDirectorListinAddBoxImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCA_DLB_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCA_DLB_CAI;
	private FinderPath _finderPathCountBygetCA_DLB_CAI;

	/**
	 * Returns all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId) {

		return findBygetCA_DLB_CAI(
			CreativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of matching creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end) {

		return findBygetCA_DLB_CAI(CreativeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return findBygetCA_DLB_CAI(
			CreativeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCA_DLB_CAI;
				finderArgs = new Object[] {CreativeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCA_DLB_CAI;
			finderArgs = new Object[] {
				CreativeApplicationId, start, end, orderByComparator
			};
		}

		List<CreativeDirectorListinAddBox> list = null;

		if (useFinderCache) {
			list = (List<CreativeDirectorListinAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeDirectorListinAddBox creativeDirectorListinAddBox :
						list) {

					if (CreativeApplicationId !=
							creativeDirectorListinAddBox.
								getCreativeApplicationId()) {

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

			sb.append(_SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_DLB_CAI_CREATIVEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeDirectorListinAddBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				list = (List<CreativeDirectorListinAddBox>)QueryUtil.list(
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
	 * Returns the first creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a matching creative director listin add box could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox findBygetCA_DLB_CAI_First(
			long CreativeApplicationId,
			OrderByComparator<CreativeDirectorListinAddBox> orderByComparator)
		throws NoSuchCreativeDirectorListinAddBoxException {

		CreativeDirectorListinAddBox creativeDirectorListinAddBox =
			fetchBygetCA_DLB_CAI_First(
				CreativeApplicationId, orderByComparator);

		if (creativeDirectorListinAddBox != null) {
			return creativeDirectorListinAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("CreativeApplicationId=");
		sb.append(CreativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeDirectorListinAddBoxException(sb.toString());
	}

	/**
	 * Returns the first creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative director listin add box, or <code>null</code> if a matching creative director listin add box could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox fetchBygetCA_DLB_CAI_First(
		long CreativeApplicationId,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		List<CreativeDirectorListinAddBox> list = findBygetCA_DLB_CAI(
			CreativeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a matching creative director listin add box could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox findBygetCA_DLB_CAI_Last(
			long CreativeApplicationId,
			OrderByComparator<CreativeDirectorListinAddBox> orderByComparator)
		throws NoSuchCreativeDirectorListinAddBoxException {

		CreativeDirectorListinAddBox creativeDirectorListinAddBox =
			fetchBygetCA_DLB_CAI_Last(CreativeApplicationId, orderByComparator);

		if (creativeDirectorListinAddBox != null) {
			return creativeDirectorListinAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("CreativeApplicationId=");
		sb.append(CreativeApplicationId);

		sb.append("}");

		throw new NoSuchCreativeDirectorListinAddBoxException(sb.toString());
	}

	/**
	 * Returns the last creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative director listin add box, or <code>null</code> if a matching creative director listin add box could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox fetchBygetCA_DLB_CAI_Last(
		long CreativeApplicationId,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		int count = countBygetCA_DLB_CAI(CreativeApplicationId);

		if (count == 0) {
			return null;
		}

		List<CreativeDirectorListinAddBox> list = findBygetCA_DLB_CAI(
			CreativeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative director listin add boxes before and after the current creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeDirectorBoxId the primary key of the current creative director listin add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox[] findBygetCA_DLB_CAI_PrevAndNext(
			long creativeDirectorBoxId, long CreativeApplicationId,
			OrderByComparator<CreativeDirectorListinAddBox> orderByComparator)
		throws NoSuchCreativeDirectorListinAddBoxException {

		CreativeDirectorListinAddBox creativeDirectorListinAddBox =
			findByPrimaryKey(creativeDirectorBoxId);

		Session session = null;

		try {
			session = openSession();

			CreativeDirectorListinAddBox[] array =
				new CreativeDirectorListinAddBoxImpl[3];

			array[0] = getBygetCA_DLB_CAI_PrevAndNext(
				session, creativeDirectorListinAddBox, CreativeApplicationId,
				orderByComparator, true);

			array[1] = creativeDirectorListinAddBox;

			array[2] = getBygetCA_DLB_CAI_PrevAndNext(
				session, creativeDirectorListinAddBox, CreativeApplicationId,
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

	protected CreativeDirectorListinAddBox getBygetCA_DLB_CAI_PrevAndNext(
		Session session,
		CreativeDirectorListinAddBox creativeDirectorListinAddBox,
		long CreativeApplicationId,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX_WHERE);

		sb.append(_FINDER_COLUMN_GETCA_DLB_CAI_CREATIVEAPPLICATIONID_2);

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
			sb.append(CreativeDirectorListinAddBoxModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(CreativeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						creativeDirectorListinAddBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeDirectorListinAddBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative director listin add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	@Override
	public void removeBygetCA_DLB_CAI(long CreativeApplicationId) {
		for (CreativeDirectorListinAddBox creativeDirectorListinAddBox :
				findBygetCA_DLB_CAI(
					CreativeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeDirectorListinAddBox);
		}
	}

	/**
	 * Returns the number of creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative director listin add boxes
	 */
	@Override
	public int countBygetCA_DLB_CAI(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_DLB_CAI;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEDIRECTORLISTINADDBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_DLB_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCA_DLB_CAI_CREATIVEAPPLICATIONID_2 =
			"creativeDirectorListinAddBox.CreativeApplicationId = ?";

	public CreativeDirectorListinAddBoxPersistenceImpl() {
		setModelClass(CreativeDirectorListinAddBox.class);

		setModelImplClass(CreativeDirectorListinAddBoxImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeDirectorListinAddBoxTable.INSTANCE);
	}

	/**
	 * Caches the creative director listin add box in the entity cache if it is enabled.
	 *
	 * @param creativeDirectorListinAddBox the creative director listin add box
	 */
	@Override
	public void cacheResult(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		entityCache.putResult(
			CreativeDirectorListinAddBoxImpl.class,
			creativeDirectorListinAddBox.getPrimaryKey(),
			creativeDirectorListinAddBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative director listin add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeDirectorListinAddBoxes the creative director listin add boxes
	 */
	@Override
	public void cacheResult(
		List<CreativeDirectorListinAddBox> creativeDirectorListinAddBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeDirectorListinAddBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeDirectorListinAddBox creativeDirectorListinAddBox :
				creativeDirectorListinAddBoxes) {

			if (entityCache.getResult(
					CreativeDirectorListinAddBoxImpl.class,
					creativeDirectorListinAddBox.getPrimaryKey()) == null) {

				cacheResult(creativeDirectorListinAddBox);
			}
		}
	}

	/**
	 * Clears the cache for all creative director listin add boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeDirectorListinAddBoxImpl.class);

		finderCache.clearCache(CreativeDirectorListinAddBoxImpl.class);
	}

	/**
	 * Clears the cache for the creative director listin add box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		entityCache.removeResult(
			CreativeDirectorListinAddBoxImpl.class,
			creativeDirectorListinAddBox);
	}

	@Override
	public void clearCache(
		List<CreativeDirectorListinAddBox> creativeDirectorListinAddBoxes) {

		for (CreativeDirectorListinAddBox creativeDirectorListinAddBox :
				creativeDirectorListinAddBoxes) {

			entityCache.removeResult(
				CreativeDirectorListinAddBoxImpl.class,
				creativeDirectorListinAddBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeDirectorListinAddBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeDirectorListinAddBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new creative director listin add box with the primary key. Does not add the creative director listin add box to the database.
	 *
	 * @param creativeDirectorBoxId the primary key for the new creative director listin add box
	 * @return the new creative director listin add box
	 */
	@Override
	public CreativeDirectorListinAddBox create(long creativeDirectorBoxId) {
		CreativeDirectorListinAddBox creativeDirectorListinAddBox =
			new CreativeDirectorListinAddBoxImpl();

		creativeDirectorListinAddBox.setNew(true);
		creativeDirectorListinAddBox.setPrimaryKey(creativeDirectorBoxId);

		creativeDirectorListinAddBox.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeDirectorListinAddBox;
	}

	/**
	 * Removes the creative director listin add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box that was removed
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox remove(long creativeDirectorBoxId)
		throws NoSuchCreativeDirectorListinAddBoxException {

		return remove((Serializable)creativeDirectorBoxId);
	}

	/**
	 * Removes the creative director listin add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative director listin add box
	 * @return the creative director listin add box that was removed
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox remove(Serializable primaryKey)
		throws NoSuchCreativeDirectorListinAddBoxException {

		Session session = null;

		try {
			session = openSession();

			CreativeDirectorListinAddBox creativeDirectorListinAddBox =
				(CreativeDirectorListinAddBox)session.get(
					CreativeDirectorListinAddBoxImpl.class, primaryKey);

			if (creativeDirectorListinAddBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeDirectorListinAddBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeDirectorListinAddBox);
		}
		catch (NoSuchCreativeDirectorListinAddBoxException
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
	protected CreativeDirectorListinAddBox removeImpl(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeDirectorListinAddBox)) {
				creativeDirectorListinAddBox =
					(CreativeDirectorListinAddBox)session.get(
						CreativeDirectorListinAddBoxImpl.class,
						creativeDirectorListinAddBox.getPrimaryKeyObj());
			}

			if (creativeDirectorListinAddBox != null) {
				session.delete(creativeDirectorListinAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeDirectorListinAddBox != null) {
			clearCache(creativeDirectorListinAddBox);
		}

		return creativeDirectorListinAddBox;
	}

	@Override
	public CreativeDirectorListinAddBox updateImpl(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		boolean isNew = creativeDirectorListinAddBox.isNew();

		if (!(creativeDirectorListinAddBox instanceof
				CreativeDirectorListinAddBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeDirectorListinAddBox.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeDirectorListinAddBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeDirectorListinAddBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeDirectorListinAddBox implementation " +
					creativeDirectorListinAddBox.getClass());
		}

		CreativeDirectorListinAddBoxModelImpl
			creativeDirectorListinAddBoxModelImpl =
				(CreativeDirectorListinAddBoxModelImpl)
					creativeDirectorListinAddBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeDirectorListinAddBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeDirectorListinAddBox.setCreateDate(date);
			}
			else {
				creativeDirectorListinAddBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeDirectorListinAddBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeDirectorListinAddBox.setModifiedDate(date);
			}
			else {
				creativeDirectorListinAddBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeDirectorListinAddBox);
			}
			else {
				creativeDirectorListinAddBox =
					(CreativeDirectorListinAddBox)session.merge(
						creativeDirectorListinAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeDirectorListinAddBoxImpl.class,
			creativeDirectorListinAddBoxModelImpl, false, true);

		if (isNew) {
			creativeDirectorListinAddBox.setNew(false);
		}

		creativeDirectorListinAddBox.resetOriginalValues();

		return creativeDirectorListinAddBox;
	}

	/**
	 * Returns the creative director listin add box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative director listin add box
	 * @return the creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeDirectorListinAddBoxException {

		CreativeDirectorListinAddBox creativeDirectorListinAddBox =
			fetchByPrimaryKey(primaryKey);

		if (creativeDirectorListinAddBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeDirectorListinAddBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeDirectorListinAddBox;
	}

	/**
	 * Returns the creative director listin add box with the primary key or throws a <code>NoSuchCreativeDirectorListinAddBoxException</code> if it could not be found.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox findByPrimaryKey(
			long creativeDirectorBoxId)
		throws NoSuchCreativeDirectorListinAddBoxException {

		return findByPrimaryKey((Serializable)creativeDirectorBoxId);
	}

	/**
	 * Returns the creative director listin add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box, or <code>null</code> if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public CreativeDirectorListinAddBox fetchByPrimaryKey(
		long creativeDirectorBoxId) {

		return fetchByPrimaryKey((Serializable)creativeDirectorBoxId);
	}

	/**
	 * Returns all the creative director listin add boxes.
	 *
	 * @return the creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative director listin add boxes
	 */
	@Override
	public List<CreativeDirectorListinAddBox> findAll(
		int start, int end,
		OrderByComparator<CreativeDirectorListinAddBox> orderByComparator,
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

		List<CreativeDirectorListinAddBox> list = null;

		if (useFinderCache) {
			list = (List<CreativeDirectorListinAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX;

				sql = sql.concat(
					CreativeDirectorListinAddBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeDirectorListinAddBox>)QueryUtil.list(
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
	 * Removes all the creative director listin add boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeDirectorListinAddBox creativeDirectorListinAddBox :
				findAll()) {

			remove(creativeDirectorListinAddBox);
		}
	}

	/**
	 * Returns the number of creative director listin add boxes.
	 *
	 * @return the number of creative director listin add boxes
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
					_SQL_COUNT_CREATIVEDIRECTORLISTINADDBOX);

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
		return "creativeDirectorBoxId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeDirectorListinAddBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative director listin add box persistence.
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

		_finderPathWithPaginationFindBygetCA_DLB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCA_DLB_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCA_DLB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCA_DLB_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCA_DLB_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_DLB_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		CreativeDirectorListinAddBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeDirectorListinAddBoxUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeDirectorListinAddBoxImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX =
		"SELECT creativeDirectorListinAddBox FROM CreativeDirectorListinAddBox creativeDirectorListinAddBox";

	private static final String _SQL_SELECT_CREATIVEDIRECTORLISTINADDBOX_WHERE =
		"SELECT creativeDirectorListinAddBox FROM CreativeDirectorListinAddBox creativeDirectorListinAddBox WHERE ";

	private static final String _SQL_COUNT_CREATIVEDIRECTORLISTINADDBOX =
		"SELECT COUNT(creativeDirectorListinAddBox) FROM CreativeDirectorListinAddBox creativeDirectorListinAddBox";

	private static final String _SQL_COUNT_CREATIVEDIRECTORLISTINADDBOX_WHERE =
		"SELECT COUNT(creativeDirectorListinAddBox) FROM CreativeDirectorListinAddBox creativeDirectorListinAddBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeDirectorListinAddBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeDirectorListinAddBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeDirectorListinAddBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeDirectorListinAddBoxPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}